package module_2.src.ss1_Intro_Java;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();
        System.out.print("Nhập cân nặng: ");
        weight = sc.nextFloat();
        bmi = weight / (Math.pow(height, 2));

        if (bmi < 18.5) {
            System.out.println("Qua gay!");
        } else if (bmi < 25.0) {
            System.out.println("Binh thuong");
        }else if(bmi < 30.0){
            System.out.println("Hoi chubby");
        }else System.out.println("Qua chubby!!!!!!!!!!!!!");
    }
}
