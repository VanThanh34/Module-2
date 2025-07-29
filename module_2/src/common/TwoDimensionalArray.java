package common;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int row = sc.nextInt();
        System.out.print("Columns: ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Input value in [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        return array;
    }

}
