package ss3_mang_va_phuong_thuc;


import common.TwoDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementOfColumn {
    public static void main(String[] args) {

        int [][] arr = TwoDimensionalArray.input2DArray();
        System.out.println("Mảng: " + Arrays.deepToString(arr));

        sumOfColumn(arr);
    }

    public static void sumOfColumn(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What column do u wanna calculate: ");
        int colIndex = sc.nextInt();

        if (colIndex < 0 || colIndex >= arr[0].length) {
            System.out.println("Invalid column number.");
            return ;
        }

        int sum = 0;
        for (int[] row : arr) {
            sum += row[colIndex];
        }
        System.out.println("Sum element of column " + colIndex + " is: " + sum);

    }
}
