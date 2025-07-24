package module_2.src.ss12_java_collection_framework.bai_tap.controller;

import module_2.src.common.InputInteger;
import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;
import module_2.src.ss12_java_collection_framework.bai_tap.service.ProductService;
import module_2.src.ss12_java_collection_framework.bai_tap.view.ProductView;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


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
                int choice = InputInteger.inputInteger();

                switch (choice) {
                    case 1 -> add();
                    case 2 -> update();
                    case 3 -> delete();
                    case 4 -> display();
                    case 5 -> search();
                    case 6 -> sort();
                    case 7 -> {
                        System.out.print("Hẹn gặp lại!");
                        return;
                    }
                    default -> System.out.println("Mời nhập đúng số trong menu!");
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
        int idUpdate = ProductView.inputId();

        Product product = service.searchById(idUpdate);
        ProductView.updateProduct(product);
        service.updateById(idUpdate, product);
        System.out.println("Đã sửa thành công!");
    }

    public static void delete() {
        int idDelete = ProductView.deleteProduct();
        Product productToDelete = service.searchById(idDelete);
        if(productToDelete == null){
            System.out.println("Không tìm thấy sản phẩm có ID: " + idDelete);
            return;
        }
        System.out.println("Thông tin sản phẩm sẽ bị xóa: ");
        System.out.println(productToDelete);
        System.out.println("Bạn có muốn xóa sản phẩm này không? (Y/N): ");
        String confirm = sc.nextLine();
        if(confirm.equalsIgnoreCase("Y")){
            boolean successs = service.delete(idDelete);
            if(successs){
                System.out.println("✅ Đã xóa sản phẩm thành công.");
            }else{
                System.out.println("❌ Xóa thất bại. Có thể sản phẩm đã bị xóa trước đó.");
            }
        } else {
            System.out.println("❎ Hủy xóa sản phẩm.");
        }

    }

    public static void display() {
        for (Product p : service.findAll()) {
            System.out.println(p);
        }
    }

    public static void search() {
        int idSearch = ProductView.searchById();
        Product p = service.searchById(idSearch);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public static void sort() {
        boolean check = true;
        while (check) {
            List<Product> product = service.findAll();
            System.out.println("""
                    ============================
                    1. Sắp xếp tăng dần theo giá
                    2. Sắp xếp giảm dần theo giá
                    3. Thoát
                    ============================
                    """);
            System.out.print("Nhập lựa chọn: ");
            int choice = InputInteger.inputInteger();
            switch (choice) {
                case 1:
                    product.sort(Comparator.comparingDouble(Product::getPrice));
                    for (Product p : product) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    product.sort(Comparator.comparingDouble(Product::getPrice).reversed());
                    for (Product p : product) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng lựa chọn.");
            }
        }
    }

}
