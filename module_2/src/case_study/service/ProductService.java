package case_study.service;

import case_study.entity.Product;

import java.util.List;

public class ProductService implements IProductService{
    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Product searchById(int id) {
        return null;
    }

    @Override
    public void updateById(int id, Product product) {

    }
}
