package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Scanner;

public class CharInStringCount {
    public static void main(String[] args) {
        String str = "VanThanh";
        System.out.println("String: " + str);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        char s = sc.next().charAt(0);
        int count = 0;
        for (int i =0; i<str.length(); i++) {
            if (str.charAt(i) == s){
                count++;
            }
        }
        System.out.println("Character '" + s + "' appears " + count + " time(s).");
    }
}
