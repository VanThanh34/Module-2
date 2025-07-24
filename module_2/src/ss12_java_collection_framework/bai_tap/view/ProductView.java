package module_2.src.ss12_java_collection_framework.bai_tap.view;

import module_2.src.common.InputInteger;
import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.util.Scanner;


public class ProductView {
    public static final Scanner sc = new Scanner(System.in);
    public static Product addProduct() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        return new Product(id, name, price);
    }

    public static void updateProduct(Product product) {
        System.out.print("Nhập tên mới: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.print("Nhập giá mới: ");
        double price = Double.parseDouble(sc.nextLine());
        product.setPrice(price);
    }

    public static int inputId(){
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


}
