package module_2.src.ss1_Intro_Java;

import java.util.Scanner;

public class Operator_Expression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = sc.nextFloat();
        System.out.println("Enter the height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
