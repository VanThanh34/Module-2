package case_study.repository;

import case_study.entity.CartItem;
import case_study.entity.Customer;
import case_study.entity.Product;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final static List<Product> products = new ArrayList<>();
    private static final String UrlFileData = "src/case_study/data/Product.csv";
    private static final String UrlFileCustomer = "src/case_study/data/Customer.csv";
    private final List<CartItem> cart = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();

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
        if (product.getId() <= 0) {
            System.out.println("ID sản phẩm phải lớn hơn 0. Vui lòng nhập lại.");
            return;
        }

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
        if (quantity <= 0) {
            return "Số lượng mua không hợp lệ!";
        }

        product.setQuantity(product.getQuantity() - quantity);
        updateById(id, product);

        double total = product.getPrice() * quantity;
        String priceFormatted = String.format("%.2f đ", product.getPrice());
        String totalFormatted = String.format("%.2f đ", total);
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        return String.format("""
                +-----------------------------------------------+
                |              MUA HÀNG THÀNH CÔNG              |
                +-----------------------------------------------+
                | Tên sản phẩm     : %-26s |
                | Số lượng         : %-26d |
                | Đơn giá          : %-26s |
                | Tổng tiền        : %-26s |
                | Thời gian mua    : %-26s |
                +-----------------------------------------------+
                """, product.getName(), quantity, priceFormatted, totalFormatted, time);

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
            Product product = item.product();
            Product storeProduct = searchById(product.getId());

            if (storeProduct == null || storeProduct.getQuantity() < item.quantity()) {
                return false;
            }
        }

        for (CartItem item : cart) {
            Product product = item.product();
            Product storeProduct = searchById(product.getId());

            storeProduct.setQuantity(storeProduct.getQuantity() - item.quantity());
            updateById(storeProduct.getId(), storeProduct);
        }

        cart.clear();
        return true;
    }

    public void infoProduct(int id) {
        List<Product> productList = findAll();
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }

    public String changeFromCart(int idDeleteCart, int quantityProductDelete) {
        for (CartItem item : cart) {
            if (item.product().getId() == idDeleteCart) {
                if (item.quantity() > quantityProductDelete) {
                    cart.remove(item);
                    cart.add(new CartItem(item.product(), item.quantity() - quantityProductDelete));
                    return "Đã giảm số lượng sản phẩm trong giỏ.";
                } else if (item.quantity() == quantityProductDelete) {
                    cart.remove(item);
                    return "Đã xoá sản phẩm khỏi giỏ hàng.";
                } else {
                    return "Số lượng xoá lớn hơn số lượng trong giỏ.";
                }
            }
        }
        return "Sản phẩm không có trong giỏ.";
    }

    public String infoProductInCart(int id) {
        for (CartItem item : cart) {
            if (item.product().getId() == id) {
                String priceFormatted = String.format("%.2f đ", item.product().getPrice());
                String totalFormatted = String.format("%.2f đ", item.getTotalPrice());

                return String.format("""
                                +--------------------------------------------------+
                                |             THÔNG TIN TRONG GIỎ HÀNG             |
                                +--------------------------------------------------+
                                | ID       : %-37d |
                                | Tên      : %-37s |
                                | Đơn giá  : %-37s |
                                | Số lượng : %-37d |
                                | Tổng     : %-37s |
                                +--------------------------------------------------+
                                """,
                        item.product().getId(),
                        item.product().getName(),
                        priceFormatted,
                        item.quantity(),
                        totalFormatted
                );
            }
        }
        return "Sản phẩm không tồn tại trong giỏ hàng.";
    }

    public void addInfoCustomer(String name, String phone) {
        try (FileWriter fileWriter = new FileWriter(UrlFileCustomer, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(name + "," + phone);
            bufferedWriter.newLine();
            System.out.println("✅ Đã lưu thông tin khách hàng vào file.");
        } catch (IOException e) {
            System.out.println("❌ Lỗi ghi file");
        }

    }

    public List<Customer> showCustomer() {
        File file = new File(UrlFileCustomer);
        customers.clear();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.trim().split(",");
                Customer customer = new Customer(temp[0], temp[1]);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File!");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!");
        }
        return new ArrayList<>(customers);
    }

    public List<Product> searchByName(String name) {
        List<Product> list = findAll();
        List<Product> result = new ArrayList<>();
        for (Product p : list) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    // Sắp xếp toàn bộ sản phẩm theo giá tăng dần
    public List<Product> sortSearchByPriceAsc() {
        List<Product> list = findAll(); // hoặc dùng trực tiếp products nếu có
        list.sort(Comparator.comparingDouble(Product::getPrice));
        return list;
    }

    // Sắp xếp toàn bộ sản phẩm theo giá giảm dần
    public List<Product> sortSearchByPriceDesc() {
        List<Product> list = findAll();
        list.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        return list;
    }

    public List<Product> sortByPriceAsc(List<Product> list) {
        list.sort(Comparator.comparingDouble(Product::getPrice));
        return list;
    }

    public List<Product> sortByPriceDesc(List<Product> list) {
        list.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        return list;
    }
}
