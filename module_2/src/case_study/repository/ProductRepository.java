package case_study.repository;

import case_study.entity.Product;

import java.util.List;

public class ProductRepository implements IProductRepository{
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
