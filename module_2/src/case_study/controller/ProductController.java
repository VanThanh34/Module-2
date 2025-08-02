package case_study.controller;

import case_study.entity.CartItem;
import case_study.entity.Product;
import case_study.main.MenuView;
import case_study.service.ProductService;


import java.util.List;
import java.util.Scanner;

public class ProductController {
    private final static ProductService service = ProductService.getInstance();
    private final static Scanner sc = new Scanner(System.in);


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
        int idDelete = MenuView.deleteProduct();
        Product productToDelete = service.searchById(idDelete);
        if (productToDelete == null) {
            System.out.println("Không tìm thấy sản phẩm có ID: " + idDelete);
            return;
        }
        System.out.println("Thông tin sản phẩm sẽ bị xóa: ");
        System.out.println(productToDelete);
        System.out.println("Bạn có muốn xóa sản phẩm này không? (Y/N): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            boolean success = service.delete(idDelete);
            if (success) {
                System.out.println("✅ Đã xóa sản phẩm thành công.");
            }

        } else {
            System.out.println("❎ Hủy xóa sản phẩm.");
        }
    }

    public static void search() {
        int idSearch = MenuView.searchById();
        Product p = service.searchById(idSearch);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }
    public static void buyProduct() {
        int id = MenuView.inputId();
        int quantity = MenuView.inputQuantity();
        String result = service.buyProduct(id, quantity);
        System.out.println(result);
    }

    public static void addToCart() {
        int id = MenuView.inputId();
        int quantity = MenuView.inputQuantity();
        String result = service.addToCart(id, quantity);
        System.out.println(result);
        showCart();
    }

    public static void showCart() {
        List<CartItem> cart = service.getCart();

        System.out.println("GIỎ HÀNG HIỆN TẠI:");
        if (cart.isEmpty()) {
            System.out.println("ĐANG TRỐNG.");
        } else {
            for (CartItem item : cart) {
                System.out.println(item);
            }
        }
    }

}
