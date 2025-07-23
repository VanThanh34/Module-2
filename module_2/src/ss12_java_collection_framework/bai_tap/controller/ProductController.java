package module_2.src.ss12_java_collection_framework.bai_tap.controller;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;
import module_2.src.ss12_java_collection_framework.bai_tap.repository.ProductRepository;
import module_2.src.ss12_java_collection_framework.bai_tap.service.IProductService;
import module_2.src.ss12_java_collection_framework.bai_tap.service.ProductService;
import module_2.src.ss12_java_collection_framework.bai_tap.view.ProductView;

import java.util.Scanner;
;

public class ProductController {
    private final static ProductService service = new ProductService();
    private final static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        do {
            try {
                System.out.println("==========MENU==========");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Sửa sản phẩm");
                System.out.println("3. Xóa sản phẩm");
                System.out.println("4. Hiển thị sản phẩm");
                System.out.println("5. Tìm kiếm sản phẩm");
                System.out.println("6. Sắp xếp sản phẩm");
                System.out.println("7. Thoát");
                System.out.print("Mời nhập vào lựa chọn của bạn: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> add();
                    case 2 -> update();
//                    case 3 -> delete();
                    case 4 -> display();
//                    case 5 -> search();
//                    case 6 -> sort();*/
                    case 7 -> {
                        System.out.print("Hẹn gặp lại!");
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(" Nhập sai định dạng! Vui lòng nhập số.");
            }
        } while (true);
    }

    public static void add() {
        Product product = ProductView.addProduct();
        service.add(product);
        System.out.println("Đã thêm sản phẩm.");
    }

    public static void update() {
        int id = ProductView.inputId();

        Product product = service.searchById(id);
        ProductView.updateProduct(product);
       service.updateById(id,product);
        System.out.println("Đã sửa thành công!");
    }
//
//    public static void delete() {
//        System.out.print("Nhập ID cần xóa: ");
//        int id = Integer.parseInt(sc.nextLine());
//        boolean success = service.deleteProduct(id);
//        if (success) {
//            System.out.println("Đã xóa sản phẩm.");
//        } else {
//            System.out.println("Không tìm thấy ID.");
//        }
//    }

    public static void display() {
        for (Product p : service.findAll()) {
            System.out.println(p);
        }
    }

//    public static void search() {
//        System.out.print("Nhập ID cần tìm: ");
//        int id = Integer.parseInt(sc.nextLine());
//        Product p = service.searchById(id);
//        if (p != null) {
//            System.out.println(p);
//        } else {
//            System.out.println("Không tìm thấy sản phẩm.");
//        }
//    }
//
//    public static void sort() {
//        System.out.println("1. Tăng dần theo giá");
//        System.out.println("2. Giảm dần theo giá");
//        int opt = Integer.parseInt(sc.nextLine());
//        if (opt == 1) {
//            service.sortByPriceAscending();
//        } else {
//            service.sortByPriceDescending();
//        }
//        display();
//    }
}
