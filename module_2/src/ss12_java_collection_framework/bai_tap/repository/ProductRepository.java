package module_2.src.ss12_java_collection_framework.bai_tap.repository;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();


    {
        products.add(new Product(1, "Quạt", 13.5));
        products.add(new Product(2, "Tủ lạnh", 50.0));
        products.add(new Product(3, "Máy giặt", 30.0));
    }

    public List<Product> getProducts() {
        return products;
    }
}
