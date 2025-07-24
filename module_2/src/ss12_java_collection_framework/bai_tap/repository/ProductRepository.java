package module_2.src.ss12_java_collection_framework.bai_tap.repository;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product product) {
        products.add(product);
        File file = new File("module_2/src/ss12_java_collection_framework/bai_tap/data/Product.csv");
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {

            bufferedWriter.write(productToString(product));
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }
    private String productToString(Product product){
        return product.getId()+","+product.getName()+","+product.getPrice();
    }
    @Override
    public boolean delete(int id) {
        Product product = searchById(id);
        if (product != null) {
            products.remove(product);
            return true;
        }
        return false;
    }

    @Override
    public Product searchById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateById(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                break;
            }
        }
    }
}
