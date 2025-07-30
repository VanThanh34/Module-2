package case_study.repository;

import case_study.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

    Product searchById(int id);

    void updateById(int id, Product product);
}

