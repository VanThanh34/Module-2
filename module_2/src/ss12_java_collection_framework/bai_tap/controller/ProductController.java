package module_2.src.ss12_java_collection_framework.bai_tap.controller;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;
import module_2.src.ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private final ProductService service = new ProductService();
    private final Scanner sc = new Scanner(System.in);


    public void add() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        service.addProduct(new Product(id, name, price));
        System.out.println("Đã thêm sản phẩm.");
    }

    public void update() {
        System.out.print("Nhập ID cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá mới: ");
        double price = Double.parseDouble(sc.nextLine());

        boolean success = service.updateProduct(id, new Product(id, name, price));
        if (success) {
            System.out.println("Sửa thành công.");
        } else {
            System.out.println("Không tìm thấy ID sản phẩm.");
        }
    }

    public void delete() {
        System.out.print("Nhập ID cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean success = service.deleteProduct(id);
        if (success) {
            System.out.println("Đã xóa sản phẩm.");
        } else {
            System.out.println("Không tìm thấy ID.");
        }
    }

    public void display() {
        for (Product p : service.getAllProducts()) {
            System.out.println(p);
        }
    }

    public void search() {
        System.out.print("Nhập ID cần tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        Product p = service.searchById(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public void sort() {
        System.out.println("1. Tăng dần theo giá");
        System.out.println("2. Giảm dần theo giá");
        int opt = Integer.parseInt(sc.nextLine());
        if (opt == 1) {
            service.sortByPriceAscending();
        } else {
            service.sortByPriceDescending();
        }
        display();
    }
}
