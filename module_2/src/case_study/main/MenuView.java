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
                case 1 -> displayMenuAdmin();
                case 2 -> displayMenuCustommer();
                case 3 -> {
                    System.out.println("Hẹn gặp lại!");
                    System.exit(3);
                }
                default -> System.out.println("Bạn hãy nhập số trong MENU!");
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
            System.out.println("║ 6.  Hiển thị danh sách khách hàng      ║");
            System.out.println("║ 7.  Quay lại menu chính                ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Lựa chọn của ông chủ: ");
            int choice = InputInteger.inputInteger();
            switch (choice) {
                case 1 -> ProductController.add();
                case 2 -> ProductController.update();
                case 3 -> ProductController.delete();
                case 4 -> ProductController.display();
                case 5 -> ProductController.search();
                case 6 -> ProductController.showCustomer();
                case 7 -> {
                    displayMenu();
                    return;
                }
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
            System.out.println("║ 3.  Nhập thông tin liên lạc            ║");
            System.out.println("║ 4.  Quay lại menu chính                ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Lựa chọn của khách hàng: ");
            int choice2 = InputInteger.inputInteger();
            switch (choice2) {
                case 1 -> {
                    ProductController.display();
                    System.out.println("====================================================");
                    displayMenuBuy();
                }
                case 2 -> ProductController.search();
                case 3 -> ProductController.infoCustomer();
                case 4 -> {
                    displayMenu();
                    return;
                }
                default -> System.out.println("Mời nhập vào đúng số trong MENU!");
            }
        }
    }

    public static String phoneNumber() {
        System.out.print("Mời nhập số điện thoại của bạn: ");
        String phone = sc.nextLine();
        String validatePhone = "^0\\d{9}$";
        while (!phone.matches(validatePhone)) {
            System.out.print("Bạn nhập sai định dạng 0xxxxxxxxx và chỉ dùng chữ sô. Vui lòng nhập lại: ");
            phone = sc.nextLine();
        }
        return phone;
    }

    public static String nameCustommer() {
        System.out.print("Mời nhập tên của bạn: ");
        String nameCus = sc.nextLine();
        String validateName = "^([A-Z][a-z]{1,10})( [A-Z][a-z]{1,10}){0,3}$";
        while (!nameCus.matches(validateName)) {
            System.out.print("Bạn nhập sai định dạng 0xxxxxxxxx và chỉ dùng chữ sô. Vui lòng nhập lại: ");
            nameCus = sc.nextLine();
        }
        return nameCus;
    }

    public static final Scanner sc = new Scanner(System.in);

    public static Product addProduct() {
        int id;
        String name;
        double price;
        int quantity;
        try {
            System.out.print("Nhập ID: ");
            id = InputInteger.inputInteger();
            System.out.print("Nhập tên: ");
            name = sc.nextLine();
            System.out.print("Nhập giá: ");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập số lượng trong kho: ");
            quantity = InputInteger.inputInteger();
        } catch (NumberFormatException e) {
            return null;
        }
        return new Product(id, name, price, quantity);
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

    public static int inputQuantity() {
        System.out.print("Nhập số lượng bạn muốn mua: ");
        return InputInteger.inputInteger();
    }

    public static int deleteProduct() {
        System.out.print("Nhập ID cần xóa: ");
        return InputInteger.inputInteger();
    }


    public static int searchById() {
        return inputId();
    }

    public static String inputName() {
        System.out.print("Mời nhập vào tên sản phẩm: ");
        return sc.nextLine();
    }

    public static void displayMenuBuy() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           MENU MUA SẮM SẢN PHẨM        ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1.  Mua sản phẩm                       ║");
        System.out.println("║ 2.  Thêm sản phẩm vào giỏ hàng         ║");
        System.out.println("║ 3.  Xem giỏ hàng hiện tại              ║");
        System.out.println("║ 4.  Tìm kiếm theo tên                  ║");
        System.out.println("║ 5.  Sắp xếp theo giá tăng dần          ║");
        System.out.println("║ 6.  Sắp xếp theo giá giảm dần          ║");
        System.out.println("║ 7.  Quay lại menu Khách hàng           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("Mời nhập vào lựa chọn của bạn: ");
        int choice3 = InputInteger.inputInteger();
        switch (choice3) {
            case 1 -> {
                ProductController.buyProduct();
                displayMenuBuy();
            }
            case 2 -> {
                ProductController.addToCart();
                System.out.println("====================================================");
                displayMenuBuy();
            }
            case 3 -> {
                ProductController.showCart();
                displayMenuCart();
            }
            case 4 -> {
                ProductController.searchByName();
                displayMenuSearch();
            }
            case 5 -> ProductController.sortAllByPriceAsc();
            case 6 -> ProductController.sortAllByPriceDesc();
            case 7 -> displayMenuCustommer();
            default -> {
                System.out.println("Vui lòng nhập số trong Menu");
                System.out.println("====================================================");
                displayMenuBuy();
            }
        }
    }

    public static void displayMenuCart() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║              MENU GIỎ HÀNG             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1.  Sửa và xoá sản phẩm                ║");
        System.out.println("║ 2.  Thêm sản phẩm                      ║");
        System.out.println("║ 3.  Thanh toán giỏ hàng hiện tại       ║");
        System.out.println("║ 4.  Quay lại menu Mua sắm              ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("Mời nhập vào lựa chọn của bạn: ");
        int choice5 = InputInteger.inputInteger();
        switch (choice5) {
            case 1 -> ProductController.changeFromCart();
            case 2 -> {
                ProductController.addToCart();
                displayMenuCart();
            }
            case 3 -> ProductController.checkoutCart();
            case 4 -> displayMenuBuy();
            default -> {
                System.out.println("Vui lòng nhập số trong Menu");
                System.out.println("====================================================");
                displayMenuCart();
            }
        }

    }

    public static void displayMenuSearch() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║              MENU TÌM KIẾM             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1.  Theo giá tăng dần                  ║");
        System.out.println("║ 2.  Theo giá giảm dần                  ║");
        System.out.println("║ 3.  Thoát ra menu Mua Sắm              ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print(" Mời nhập vào lựa chọn của bạn: ");
        int choice6 = InputInteger.inputInteger();
        if (choice6 == 1) {
            ProductController.sortLastSearchByPriceAsc();
        } else if (choice6 == 2) {
            ProductController.sortLastSearchByPriceDesc();
        } else if (choice6 == 3) {
            displayMenuBuy();
        } else {
            System.out.println("Mời nhập đúng số trong menu!");
        }
    }
}

