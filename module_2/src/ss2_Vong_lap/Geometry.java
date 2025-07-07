package module_2.src.ss2_Vong_lap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                    for (int i = 0 ; i <= 5 ; i++) {
                        System.out.println("*".repeat(i));
                    }
                    break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    for (int j = 4 ; j < 5 ; j++) {
                        System.out.println("*  ".repeat(j));
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 4 ; j < 5 ; j++) {
                        System.out.println("* ".repeat(j));
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                }
            System.out.println();
        }
    }
    }

