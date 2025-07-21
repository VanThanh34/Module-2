package module_2.src.ss12_java_collection_framework.bai_tap.controller;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("==========MENU==========");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Sắp xếp sản phẩm");
        System.out.println("7. Thoát");
        System.out.print("Mời nhập vào lựa chọn của bạn: ");
        Integer choice = sc.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("");
                case 2:
                    System.out.println("");
                case 3:
                    System.out.println("");
                case 4:
                    System.out.println("");
                case 5:
                    System.out.println("");
                case 6:
                    System.out.println("");
                case 7:
                    System.out.print("Hẹn gặp lại!");
                    break;
            }
        }
    }


}
