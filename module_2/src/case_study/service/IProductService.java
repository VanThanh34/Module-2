package case_study.service;

import case_study.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

    Product searchById(int id);

    void updateById(int id, Product product);
}
