package module_2.src.ss13_giai_thuat;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        String [] n  = {"a" , "b" , "c" , "d", "e", "f", "x", "y", "z"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (String i : n) {
            if (i.equals(s)) {
                System.out.println("Đã tìm thấy " + s);
            }
        }
    }
}
