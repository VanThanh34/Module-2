package module_2.src.ss1_Intro_Java;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;
        System.out.print("Nhập số năm: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("Năm %d là năm nhuận", year);
        }else
            System.out.printf("%d không phải là năm nhuận", year);
    }
}
