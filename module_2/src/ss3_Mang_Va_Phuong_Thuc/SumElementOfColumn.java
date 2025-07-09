package module_2.src.ss3_Mang_Va_Phuong_Thuc;


import java.util.Arrays;
import java.util.Scanner;

public class SumElementOfColumn {
    public static void main(String[] args) {

        int [][] arr = input2DArray();
        System.out.println("Mảng: " + Arrays.deepToString(arr));

        sumOfColumn(arr);
    }

    public static void sumOfColumn(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What column do u wanna carculate: ");
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
