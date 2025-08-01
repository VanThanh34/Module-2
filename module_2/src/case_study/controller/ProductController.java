package case_study.controller;

import case_study.entity.Product;
import case_study.main.MenuView;
import case_study.service.ProductService;


//import java.util.Scanner;

public class ProductController {
    private final static ProductService service = ProductService.getInstance();
//    private final static Scanner sc = new Scanner(System.in);


    public static void add() {
        Product product = MenuView.addProduct();
        service.add(product);
    }
    public static void display() {
        for (Product p : service.findAll()) {
            System.out.println(p);
        }
    }

    public static void update() {
        int idUpdate = MenuView.inputId();
        Product product = service.searchById(idUpdate);
        MenuView.updateProduct(product);
        service.updateById(idUpdate, product);
        System.out.println("Đã sửa thành công!");
    }

    public static void delete() {
    service.findAll();
    }

    public static void search() {
    service.findAll();
    }
}
