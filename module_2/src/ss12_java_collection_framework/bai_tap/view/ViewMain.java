package module_2.src.ss12_java_collection_framework.bai_tap.view;

import module_2.src.ss12_java_collection_framework.bai_tap.controller.ProductController;

import java.util.Scanner;

public class ViewMain {


    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Mời nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> controller.add();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.display();
                case 5 -> controller.search();
                case 6 -> controller.sort();
                case 7 -> System.out.print("Hẹn gặp lại!");
            }
        } while (choice != 7);
    }
}
