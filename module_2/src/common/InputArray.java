package common;

import java.util.Scanner;

public class InputArray {
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
