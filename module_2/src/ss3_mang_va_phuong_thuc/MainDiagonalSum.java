package ss3_mang_va_phuong_thuc;


import common.TwoDimensionalArray;

public class MainDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = TwoDimensionalArray.input2DArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][i];
            }
        System.out.println("Sum of main diagona is: " +sum);
        }
    }

