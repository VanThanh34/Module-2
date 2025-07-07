package module_2.src.ss2_Vong_lap;

import java.util.Scanner;

public class DisplayTheType {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 7; j < 8; j++) {
                            System.out.println("* ".repeat(j));
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("*".repeat(i));
                    }
                    System.out.println();
                    for (int i = 5; i >= 0; i--) {
                        System.out.println("*".repeat(i));
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = i; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i +1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                    case 4:
                        System.out.println();
                        System.out.println("Goodbye bro!");
                        System.exit(4);

                default:
                    System.out.println();
                    System.out.println("Invalid choice");
                    System.out.println();
            }
        }
    }
}

