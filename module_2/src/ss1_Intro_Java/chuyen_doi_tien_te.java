package module_2.src.ss1_Intro_Java;


import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        boolean check = true;
        while (check){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số tiền đô: ");
        int usd = sc.nextInt();
        if(usd >= 0){
        double vnd = usd * 23000;
        System.out.printf("%d đô đổi sang tiền Việt là:  %.2f VND", usd, vnd);
        check = false;
    }else{
            System.out.println("Mời nhập số hợp lệ");
            check = true;
        }
    }
    }
}
