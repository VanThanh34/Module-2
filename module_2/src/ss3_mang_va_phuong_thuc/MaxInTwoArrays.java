package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Arrays;

public class MaxInTwoArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Array is: " + Arrays.deepToString(arr));
        int max = arr[0][0];
        for (int[] row : arr){
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("Max value in array: "+max);
    }
}
