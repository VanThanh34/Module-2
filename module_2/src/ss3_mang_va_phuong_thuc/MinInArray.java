package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = inputArray();
        int min = minInArray(arr);
        System.out.println("The minimum element is: " + min);
    }
    public static int minInArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the elements %d of the array: ", (i+1));
            arr[i] = sc.nextInt();
        }
            return arr;
    }
}
