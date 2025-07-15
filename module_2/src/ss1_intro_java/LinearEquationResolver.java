package module_2.src.ss1_intro_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a question as 'a*x +b = c', please");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        if(a!= 0){
            double x = (c - b) / a;
            System.out.printf("Đáp án x = %.2f\n", x);
            System.out.flush();
            System.out.println(a+" "+b+" "+ c);
        }else{
            if(b == c){
                System.out.println("Vô số nghiệm");
            }else System.out.println("Vô nghiệm");
        }
    }
}
