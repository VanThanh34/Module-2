package module_2.src.ss2_vong_lap;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.print("Mời nhập vào 1 số: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        checkPrime(n);
    }

    public static void checkPrime(int n) {
        if(n < 2){
            System.out.println("Số " + n + " không phải là số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Số " + n + " là số nguyên tố.");
            }else{
                System.out.println("Số " + n + " không phải là số nguyên tố");
            }
        }
    }
}
