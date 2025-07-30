package ss19_string_regex.btap.ValidatePhone;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        System.out.print("Moi nhap vao so dien thoai: ");
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();
        String validate = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        while(!phoneNum.matches(validate)){
            System.out.print("Ban nhap sai dinh dang (xx)-(0xxxxxxxxx). Vui long nhap lai: ");
            phoneNum = sc.nextLine();
        }
        System.out.print("SDT cua ban la: " + phoneNum);
    }
}
