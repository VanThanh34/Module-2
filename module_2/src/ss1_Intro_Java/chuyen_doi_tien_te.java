package module_2.src.ss1_Intro_Java;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số tiền đô: ");
        int usd = sc.nextInt();
        double vnd = usd * 23000;
        System.out.printf("%d đô đổi sang tiền Việt là:  %.2f VND", usd, vnd);
    }
}
