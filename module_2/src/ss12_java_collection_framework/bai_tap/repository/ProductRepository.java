package module_2.src.ss12_java_collection_framework.bai_tap.repository;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void update(int index, Product product) {
        products.set(index, product);
    }

    public void delete(int index) {
        products.remove(index);
    }

    public List<Product> getAll() {
        return products;
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
