package module_2.src.ss12_java_collection_framework.bai_tap.repository;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final static List<Product> products = new ArrayList<>();


//    static {
//        products.add(new Product(1, "Quạt", 13.5));
//        products.add(new Product(2, "Tủ lạnh", 50.0));
//        products.add(new Product(3, "Máy giặt", 30.0));
//    }


    @Override
    public List<Product> findAll() {
//        return new ArrayList<>(products);
        File file = new File("module_2/src/ss12_java_collection_framework/bai_tap/data/Product.csv");
        List<Product> products = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line ;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.trim().split(",");
                Product product = new Product(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
        }
        System.out.println("Đang đọc file: " + file.getAbsolutePath());
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product product) {
        products.add(product);
        File file = new File("module_2/src/ss12_java_collection_framework/bai_tap/data/Product.csv");
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {

            bufferedWriter.write(productToString(product));
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    private String productToString(Product product) {
        return product.getId() + "," + product.getName() + "," + product.getPrice();
    }

    @Override
    public boolean delete(int id) {
        List<Product> productList = findAll();
        boolean isRemoved = false;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Thông tin sản phẩm sẽ bị xóa:");
                System.out.println(productList.get(i)); // hiện sản phẩm cho chắc ăn
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
        List<Product> productList = findAll();
        for (Product p : productList) {
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
            System.out.println("Không tìm thấy sản phẩm để cập nhật.");
        }
    }
    private void overwriteFile(List<Product> productList) {
        File file = new File("module_2/src/ss12_java_collection_framework/bai_tap/data/Product.csv");
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (Product product : productList) {
                bufferedWriter.write(productToString(product));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi đè file.");
        }
    }

}
