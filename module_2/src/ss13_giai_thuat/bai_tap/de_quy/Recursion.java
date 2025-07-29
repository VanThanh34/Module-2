package ss13_giai_thuat.bai_tap.de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number elements of array: ");
        int[] arr1 = new int[sc.nextInt()];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter elements " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        System.out.print("Enter number u wanna check: ");
        int m = sc.nextInt();
        System.out.println("Index of number in array is: " + binarySearch(arr1, m, 0, arr1.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left > right) {
            return -1;}
        else {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            } else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }
    }
}
