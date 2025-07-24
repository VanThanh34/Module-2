package module_2.src.ss12_java_collection_framework.bai_tap.service;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

    Product searchById(int id);

    void updateById(int id, Product product);

}
