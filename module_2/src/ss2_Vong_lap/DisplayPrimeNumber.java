package module_2.src.ss2_Vong_lap;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số lượng nguyên tố cần in ra: ");
            n = sc.nextInt();
        } while (n < 0);
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num - 1; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
