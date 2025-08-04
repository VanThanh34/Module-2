package case_study.repository;

import case_study.entity.CartItem;
import case_study.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final static List<Product> products = new ArrayList<>();
    private static final String UrlFileData = "src/case_study/data/Product.csv";
    private final List<CartItem> cart = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        File file = new File(UrlFileData);
        products.clear();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.trim().split(",");
                Product product = new Product(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File!");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!");
        }
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product product) {
        //kiểm tra id trùng lặp
        List<Product> productList = findAll();
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                System.out.println("ID sản phẩm đã tồn tại. Không thể thêm trùng ID.");
                return;
            }
        }

        products.add(product);
        File file = new File(UrlFileData);

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(productToString(product));
            bufferedWriter.newLine();
            System.out.println("Đã thêm sản phẩm thành công!");
            System.out.println("============================");
        } catch (IOException e) {
            System.out.println("Lỗi ghi thông tin: " + e.getMessage());
        }

    }

    private String productToString(Product product) {
        return product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getQuantity();
    }

    @Override
    public boolean delete(int id) {
        List<Product> productList = findAll();
        boolean isRemoved = false;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Thông tin sản phẩm sẽ bị xóa:");
                System.out.println(productList.get(i));
                productList.remove(i);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            overwriteFile(productList);
            return true;
        }
        return false;
    }

    @Override
    public Product searchById(int id) {
        for (Product p : findAll()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateById(int id, Product product) {
        List<Product> productList = findAll();
        boolean found = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
                found = true;
                break;
            }
        }
        if (found) {
            overwriteFile(productList);
        } else {
            System.out.println("Không tìm thấy sản phẩm để cập nhật");
        }
    }

    private void overwriteFile(List<Product> productList) {
        File file = new File(UrlFileData);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Product product : productList) {
                bufferedWriter.write(productToString(product));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi đè File.");
        }
    }

    public String buyProduct(int id, int quantity) {
        Product product = searchById(id);
        if (product == null) {
            return "Không tìm thấy sản phẩm.";
        }

        if (product.getQuantity() < quantity) {
            return "Số lượng sản phẩm không đủ trong kho.";
        }

        product.setQuantity(product.getQuantity() - quantity);
        updateById(id, product);

        double total = product.getPrice() * quantity;

        return "Mua hàng thành công!\nTên SP: " + product.getName()
                + "\nSố lượng: " + quantity
                + "\nĐơn giá: " + product.getPrice()
                + "\nTổng tiền: " + total + " VNĐ";
    }

    public String addToCart(int id, int quantity) {
        Product product = searchById(id);
        if (product == null) {
            return "Không tìm thấy sản phẩm.";
        }
        if (product.getQuantity() < quantity) {
            return "Sản phẩm không đủ số lượng để thêm vào giỏ.";
        }

        cart.add(new CartItem(product, quantity));
        return "Đã thêm sản phẩm vào giỏ hàng.";
    }

    public List<CartItem> getCart() {
        return cart;
    }

    public boolean checkout() {
        List<CartItem> cart = getCart();

        for (CartItem item : cart) {
            Product product = item.getProduct();
            Product storeProduct = searchById(product.getId());

            if (storeProduct == null || storeProduct.getQuantity() < item.getQuantity()) {
                return false;
            }
        }

        for (CartItem item : cart) {
            Product product = item.getProduct();
            Product storeProduct = searchById(product.getId());

            storeProduct.setQuantity(storeProduct.getQuantity() - item.getQuantity());
            updateById(storeProduct.getId(), storeProduct);
        }

        cart.clear();
        return true;
    }
}
