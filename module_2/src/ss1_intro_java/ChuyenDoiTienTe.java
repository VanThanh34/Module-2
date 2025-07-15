package module_2.src.ss1_intro_java;


import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số tiền đô: ");
        int usd = sc.nextInt();
        if(usd >= 0){
        double vnd = usd * 23000;
        System.out.printf("%d đô đổi sang tiền Việt là:  %.2f VND", usd, vnd);
        break;
    }else{
            System.out.println("Mời nhập số hợp lệ");
        }
    }
    }
}
