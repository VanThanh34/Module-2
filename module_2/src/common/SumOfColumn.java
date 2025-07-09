package module_2.src.common;

import java.util.Scanner;

public class SumOfColumn {
    public static void sumOfColumn(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What column do u wanna carculate: ");
        int colIndex = sc.nextInt();

        if (colIndex < 0 || colIndex >= arr[0].length) {
            System.out.println("Invalid column number.");
            return;
        }

        int sum = 0;
        for (int[] row : arr) {
            sum += row[colIndex];
        }

        System.out.println("Sum element of column " + colIndex + " is: " + sum);
    }

}
