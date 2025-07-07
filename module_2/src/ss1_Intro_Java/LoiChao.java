package module_2.src.ss1_Intro_Java;

import java.util.Scanner;

public class LoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String n = sc.next();
        System.out.printf("Hello: %s", n);

    }
}
