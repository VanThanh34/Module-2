package module_2.src.ss2_Vong_lap;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Mời nhập vào số thứ hai: ");
        int num2 = sc.nextInt();
        if(num1==0 && num2==0){
            System.out.println("2 số này không có ước chung lớn nhất!");
        }else if(num1 == 0 && num2 !=0){
            int result = Math.abs(num2);
            System.out.println("Ước chung lớn nhất 2 số là: " + result);
        }else if(num1 != 0 && num2 == 0){
            int result = Math.abs(num1);
            System.out.println("Ước chung lớn nhất 2 số là: " + result);
        }else {
            //Dùng thuật toán Euclid (trừ số lớn hơn cho số nhỏ hơn, khi 2 số bằng nhau, là ước chung)
            int a = Math.abs(num1);
            int b = Math.abs(num2);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Ước chung lớn nhất của 2 số là: " + a);
        }
    }
}
