package module_2.src.common;

import java.util.Scanner;

public class InputInteger {
    public static int inputInteger() {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên dương. Mời nhập lại!");
                continue;
            }
            return choice;
        }
    }
}
