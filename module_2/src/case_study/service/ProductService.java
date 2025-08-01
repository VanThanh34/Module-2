package case_study.service;

import case_study.entity.Product;
import case_study.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    public static ProductRepository repository = new ProductRepository();
    private static ProductService instance;

    private ProductService() {
    }

    public static synchronized ProductService getInstance(){
        if(instance == null){
            instance = new ProductService();
        }
        return instance;
    }
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public void add(Product product) {
    repository.add(product);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public Product searchById(int id) {
        return repository.searchById(id);
    }

    @Override
    public void updateById(int id, Product product) {
        repository.updateById(id, product);
    }
}
