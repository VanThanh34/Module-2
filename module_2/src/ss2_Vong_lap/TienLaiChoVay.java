package module_2.src.ss2_Vong_lap;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        double soTien;
        double laiSuat;
        int soThangChoVay;
        double soTienLai = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng tiền bạn cho vay: ");
        soTien = sc.nextDouble();
        System.out.print("Lãi suất theo tháng: ");
        laiSuat = sc.nextDouble();
        System.out.print("Số tháng cho vay: ");
        soThangChoVay = sc.nextInt();
        for (int i = 0; i < soThangChoVay; i++) {
            soTienLai += soTien * (laiSuat/100)/12 * soThangChoVay;
        }
        System.out.printf("Số tiền lãi là: %.1f VND", soTienLai);
    }
}
