package ss14_sap_xep.btap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 extends InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number element of array: ");
        int n = Integer.parseInt(sc.nextLine());
        int [] arr = new int [n] ;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sort: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sort:  "+Arrays.toString(arr));
    }
}
