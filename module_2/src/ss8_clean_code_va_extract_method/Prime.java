package module_2.src.ss8_clean_code_va_extract_method;

import java.util.Scanner;

import static module_2.src.ss2_vong_lap.CheckPrime.checkPrime;

public class Prime {


    public static void main(String[] args) {
        System.out.print("Mời nhập vào 1 số: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        checkPrime(n);
    }




}
