package module_2.src.mvc.view;

import module_2.src.mvc.controller.StudentController;
import module_2.src.mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController studentController = new StudentController();

    public static void main(String[] args) {

        System.out.println("Chào mừng bạn đến với hệ thống của chúng tôi");
        while (true) {
            System.out.println("MỜi bạn chọn chức năng");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý nhân viên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chức năng bạn muốn?: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void menuStudent() {
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. Danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Cập nhật học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Quay lại menu chính");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    List<Student> students = studentController.getAll();
//                Hiển thị
                    if(students.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 5:
                    return;
            }
        }
    }


}
