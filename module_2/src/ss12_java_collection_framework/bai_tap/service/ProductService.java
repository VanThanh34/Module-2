package module_2.src.ss12_java_collection_framework.bai_tap.service;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;
import module_2.src.ss12_java_collection_framework.bai_tap.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;

public class ProductService {
    private final ProductRepository repository = new ProductRepository();

    public void addProduct(Product product) {
        repository.getProducts().add(product);
    }

    public boolean updateProduct(int id, Product updatedProduct) {
        int index = findIndexById(id);
        if (index != -1) {
            repository.getProducts().set(index, updatedProduct);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            repository.getProducts().remove(index);
            return true;
        }
        return false;
    }

    public List<Product> getAllProducts() {
        return repository.getProducts();
    }

    public Product searchById(int id) {
        for (Product p : repository.getProducts()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void sortByPriceAscending() {
        repository.getProducts().sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        repository.getProducts().sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
    }

    public int findIndexById(int id) {
        List<Product> products = repository.getProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
