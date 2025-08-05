package case_study.controller;

import case_study.entity.CartItem;
import case_study.entity.Customer;
import case_study.entity.Product;
import case_study.main.MenuView;
import case_study.service.ProductService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private final static ProductService service = ProductService.getInstance();
    private final static Scanner sc = new Scanner(System.in);
    private static List<Product> lastSearchResult = new ArrayList<>();

    public static void add() {
        Product product = MenuView.addProduct();
        if (product != null) {
            service.add(product);
        } else {
            System.out.println("❌ Không thể thêm sản phẩm vì dữ liệu không hợp lệ.");
        }
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
        System.out.println("✅ Đã sửa thành công!");
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
            System.out.println("❌ Không tìm thấy sản phẩm.");
        }
    }

    public static void buyProduct() {
        int id = MenuView.inputId();
        service.infoProduct(id);
        int quantity = MenuView.inputQuantity();
        String result = service.buyProduct(id, quantity);
        System.out.println(result);
    }

    public static void addToCart() {
        int id = MenuView.inputId();
        service.infoProduct(id);
        int quantity = MenuView.inputQuantity();
        String result = service.addToCart(id, quantity);
        System.out.println(result);
        showCart();
    }

    public static void showCart() {
        List<CartItem> cart = ProductService.getCart();

        System.out.println("GIỎ HÀNG HIỆN TẠI:");
        if (cart.isEmpty()) {
            System.out.println("ĐANG TRỐNG.");
        } else {
            System.out.println("+----+------------------------------+--------+------------+------------+");
            System.out.println("| ID| Tên sản phẩm                  |   SL   |  Đơn giá   | Thành tiền |");
            System.out.println("+----+------------------------------+--------+------------+------------+");


            double total = 0;
            for (CartItem item : cart) {
                int id = item.product().getId();
                String name = item.product().getName();
                int quantity = item.quantity();
                double price = item.product().getPrice();
                double totalPrice = item.getTotalPrice();
                total += totalPrice;

                System.out.printf("| %2d | %-28s | %6d | %10.2f | %10.2f |\n",
                        id, name, quantity, price, totalPrice);
            }

            System.out.println("+----+------------------------------+--------+------------+------------+");
            System.out.printf("Tổng cộng: %.2f đ\n", total);
        }
    }


    public static void checkoutCart() {
        List<CartItem> cart = ProductService.getCart();

        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng của bạn đang trống.");
            return;
        }

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║         HÓA ĐƠN TẠM TÍNH GIỎ HÀNG      ║");
        System.out.println("╠════════════════════════════════════════╣");

        double total = 0;
        for (CartItem item : cart) {
            Product p = item.product();
            double subTotal = p.getPrice() * item.quantity();
            total += subTotal;
            System.out.printf("║ %-16s x%-3d : %,10.2f VND ║\n",
                    p.getName(), item.quantity(), subTotal);
        }

        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ %-24s %,9.2f VND ║\n", "Tổng cộng:", total);
        System.out.println("╚════════════════════════════════════════╝");

        System.out.print("Bạn có muốn thanh toán không? (y/n): ");
        Scanner sc = new Scanner(System.in);
        String confirm = sc.nextLine().toLowerCase();

        if (confirm.equals("y")) {
            if (ProductService.checkout()) {
                String time = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                System.out.println("✅ Thanh toán thành công! Cảm ơn bạn đã mua hàng.");
                System.out.println("🕒 Thời gian thanh toán: " + time);
            } else {
                System.out.println("❌ Thanh toán thất bại. Một số sản phẩm trong giỏ không đủ số lượng trong kho.");
            }
        } else {
            System.out.println("❌ Đã hủy thanh toán.");
        }
    }

    public static void changeFromCart() {
        System.out.print("Nhập vào ID sản phẩm bạn muốn sửa: ");
        int idDeleteCart = Integer.parseInt(sc.nextLine());
        System.out.println(service.infoProductInCart(idDeleteCart));
        System.out.print("Nhập số lượng bạn muốn sửa: ");
        int quantityProductDelete = Integer.parseInt(sc.nextLine());
        String result = service.changeFromCart(idDeleteCart, quantityProductDelete);
        System.out.println(result);
        showCart();
    }

    public static void infoCustomer() {
        String name = MenuView.nameCustommer();
        String phone = MenuView.phoneNumber();
        service.addInfoCustomer(name, phone);
    }

    public static void showCustomer() {
        for (Customer customer : service.showCustomer()) {
            System.out.println(customer);
        }
    }

    public static void searchByName() {
        String name = MenuView.inputName();
        List<Product> products = service.searchByName(name);
        lastSearchResult = products;
        if (products.isEmpty()) {
            System.out.println("============================");
            System.out.println("Không tìm thấy sản phẩm nào.");
            System.out.println("============================");
        } else {
            System.out.println("======== Kết quả tìm kiếm ========");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    public static void sortAllByPriceAsc() {
        List<Product> products = service.sortByPriceAsc();
        System.out.println("======== Danh sách sản phẩm (giá tăng dần) ========");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void sortAllByPriceDesc() {
        List<Product> products = service.sortByPriceDesc();
        System.out.println("======== Danh sách sản phẩm (giá giảm dần) ========");
        for (Product p : products) {
            System.out.println(p);
        }
    }


    public static void sortLastSearchByPriceAsc() {
        if (lastSearchResult == null || lastSearchResult.isEmpty()) {
            System.out.println("Chưa có kết quả tìm kiếm nào để sắp xếp.");
            return;
        }
        List<Product> sorted = service.sortByPriceAsc(new ArrayList<>(lastSearchResult));
        System.out.println("======== Sắp xếp theo giá tăng dần ========");
        for (Product p : sorted) {
            System.out.println(p);
        }
    }

    public static void sortLastSearchByPriceDesc() {
        if (lastSearchResult == null || lastSearchResult.isEmpty()) {
            System.out.println("Chưa có kết quả tìm kiếm nào để sắp xếp.");
            return;
        }
        List<Product> sorted = service.sortByPriceDesc(new ArrayList<>(lastSearchResult));
        System.out.println("======== Sắp xếp theo giá giảm dần ========");
        for (Product p : sorted) {
            System.out.println(p);
        }
    }
}


