package ss19_string_regex.btap.ValidateClass;

import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        System.out.print("Moi nhap vao ten lop hoc: ");
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        String validate = "^[ACP]\\d{4}[GHIK]$";
        while (!className.matches(validate)) {
            System.out.print("Nhap sai dinh dang. Moi nhap lai: ");
            className = sc.nextLine();
        }
        System.out.print("Lop cua ban ten la: "+className);
    }
}
