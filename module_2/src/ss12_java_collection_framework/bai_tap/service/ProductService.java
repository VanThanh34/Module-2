package module_2.src.ss12_java_collection_framework.bai_tap.service;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;
import module_2.src.ss12_java_collection_framework.bai_tap.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;

public class ProductService {
    private final ProductRepository repository = new ProductRepository();

    public void addProduct(Product product) {
        repository.add(product);
    }

    public boolean updateProduct(int id, Product updatedProduct) {
        int index = repository.findIndexById(id);
        if (index != -1) {
            repository.update(index, updatedProduct);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        int index = repository.findIndexById(id);
        if (index != -1) {
            repository.delete(index);
            return true;
        }
        return false;
    }

    public List<Product> getAllProducts() {
        return repository.getAll();
    }


    public Product searchById(int id) {
        return repository.findById(id);
    }

    public void sortByPriceAscending() {
        repository.getAll().sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        repository.getAll().sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
    }
}
