package module_2.src.ss4_lop_va_doi_tuong;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public int getDiscriminant(int a, int b, int c) {
        return b*b-4*a*c;
    }
    public double getRoot1(double a, double b, double c) {
        return (-b+Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double getRoot2(double a, double b, double c) {
        return (-b-Math.sqrt(b*b - 4*a*c))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        QuadraticEquation quadra= new QuadraticEquation(num1, num2, num3);
        double result = quadra.getDiscriminant(num1, num2, num3);
        if (result > 0) {
            double result1 = quadra.getRoot1(num1, num2, num3);
            double result2 = quadra.getRoot2(num1, num2, num3);
            System.out.println("Roots of quadratic equation: " + result1 +" and " + result2);
        }else if(result == 0) {
            double result3 = quadra.getRoot1(num1, num2, num3);
            System.out.println("Root of quadratic equation: " + result3);
        }else System.out.println("The equation has no roots.");

        double num4 = quadra.getA();
        System.out.println(num4);
        double num5 = quadra.getB();
        System.out.println(num5);
        double num6 = quadra.getC();
        System.out.println(num6);
    }
}
