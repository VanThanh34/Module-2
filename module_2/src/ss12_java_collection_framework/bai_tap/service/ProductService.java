//package ss12_java_collection_framework.bai_tap.service;
//
//
//
//
//import ss12_java_collection_framework.bai_tap.entity.Product;
//import ss12_java_collection_framework.bai_tap.repository.ProductRepository;
//
//import java.util.List;
//
//
//public class ProductService implements IProductService {
//    private final ProductRepository repository = new ProductRepository();
//
//
//    @Override
//    public List<Product> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public void add(Product product) {
//        repository.add(product);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return repository.delete(id);
//    }
//
//    @Override
//    public Product searchById(int id) {
//        return repository.searchById(id);
//    }
//
//    @Override
//    public void updateById(int id, Product product) {
//        repository.updateById(id, product);
//    }
//
//
//
//}
