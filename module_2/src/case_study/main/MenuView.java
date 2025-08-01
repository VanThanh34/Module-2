package case_study.main;

import case_study.controller.ProductController;
import case_study.entity.Product;
import common.InputInteger;

import java.util.Scanner;

public class MenuView {
    public static void displayMenu() {

        while (true) {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║           MENU CHỨC NĂNG           ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println("║  1.  Quản trị viên (Admin)         ║");
            System.out.println("║  2.  Khách hàng (Customer)         ║");
            System.out.println("║  3.  Thoát                         ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.print("👉 Chọn chức năng của bạn: ");
            int choice = InputInteger.inputInteger();
            switch (choice) {
                case 1:
                    displayMenuAdmin();
                case 2:
                    displayMenuCustommer();
                case 3:
                    System.out.println("Hẹn gặp lại!");
                    return;
                default:
                    System.out.println("Bạn hãy nhập số trong MENU!");
                    break;
            }
        }
    }

    public static void displayMenuAdmin() {
        while (true) {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║           MENU QUẢN TRỊ VIÊN           ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1.  Thêm sản phẩm                      ║");
            System.out.println("║ 2.  Sửa sản phẩm                       ║");
            System.out.println("║ 3.  Xóa sản phẩm                       ║");
            System.out.println("║ 4.  Hiển thị danh sách sản phẩm        ║");
            System.out.println("║ 5.  Tìm kiếm sản phẩm                  ║");
            System.out.println("║ 6.  Quay lại menu chính                ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Lựa chọn của ông chủ: ");
            int choice = InputInteger.inputInteger();
            switch (choice) {
                case 1 -> ProductController.add();
                case 2 -> ProductController.update();
                case 3 -> ProductController.delete();
                case 4 -> ProductController.display();
                case 5 -> ProductController.search();
                case 6 -> displayMenu();
                default -> System.out.println("Mời nhập vào đúng số trong MENU!");
            }
        }
    }

    public static void displayMenuCustommer() {
        while (true) {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║           MENU KHÁCH HÀNG              ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1.  Hiển thị danh sách sản phẩm        ║");
            System.out.println("║ 2.  Tìm kiếm sản phẩm                  ║");
            System.out.println("║ 3.  Nhập số điện thoại để liên hệ      ║");
            System.out.println("║ 4.  Quay lại menu chính                ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Lựa chọn của khách hàng: ");
            int choice2 = InputInteger.inputInteger();
            switch (choice2) {
                case 1 -> {ProductController.display();
                    System.out.println("===========================");
                    displayMenuBuy();}
                case 2 -> ProductController.search();
                case 3 -> phoneNumber();
                case 4 -> displayMenu();
                default -> System.out.println("Mời nhập vào đúng số trong MENU!");
            }
        }
    }

    public static void phoneNumber() {
        System.out.print("Mời nhập số điện thoại của bạn: ");
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();
        String validatePhone = "^0\\d{9}$";
        while (!phone.matches(validatePhone)) {
            System.out.print("Bạn nhập sai định dạng 0xxxxxxxxx và chỉ dùng chữ sô. Vui lòng nhập lại: ");
            phone = sc.nextLine();
        }
        System.out.println("Số điện thoại của bạn là: " + phone);
        System.out.println("Shop sẽ liên hệ bạn sau nhé!");
        System.out.println();
    }

    public static final Scanner sc = new Scanner(System.in);

    public static Product addProduct() {
        System.out.print("Nhập ID: ");
        int id = InputInteger.inputInteger();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng trong kho: ");
        int quantity = InputInteger.inputInteger();
        return new Product(id, quantity, price, name);
    }


    public static void updateProduct(Product product) {
        System.out.print("Nhập tên mới: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.print("Nhập giá mới: ");
        double price = Double.parseDouble(sc.nextLine());
        product.setPrice(price);
        System.out.print("Nhập số lượng trong kho: ");
        int quantity = InputInteger.inputInteger();
        product.setQuantity(quantity);
    }

    public static int inputId() {
        System.out.print("Nhập ID cần tìm: ");
        return InputInteger.inputInteger();
    }

    public static int deleteProduct() {
        System.out.print("Nhập ID cần xóa: ");
        return InputInteger.inputInteger();
    }

    public static int searchById() {
        return inputId();
    }

    public static void displayMenuBuy() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           MENU MUA SẮM SẢN PHẨM        ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1.  Mua sản phẩm                       ║");
        System.out.println("║ 2.  Thêm sản phẩm vào giỏ hàng         ║");
        System.out.println("║ 3.  Quay lại menu Khách hàng           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("Mời nhập vào lựa chọn của bạn: ");
        int choice3 = InputInteger.inputInteger();
        switch (choice3) {
            case 1:
            case 2:
            case 3:
                displayMenuCustommer();
                break;
            default:
                System.out.println("Vui lòng nhập số trong Menu");
                System.out.println("============================");
                break;
        }
    }
}
