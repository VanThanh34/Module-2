package module_2.src.ss3_Mang_Va_Phuong_Thuc;

import module_2.src.common.TwoDimensionalArray;

public class MainDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = TwoDimensionalArray.input2DArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagona is: " +sum);
    }
}
