package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter %d elements in First Array:\n", arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.printf("\nEnter %d elements in Second Array:\n", arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = mergeArray(arr1, arr2);
        System.out.println("The merged array is: " +Arrays.toString(result));


    }
    public static int[] mergeArray(int [] a, int[] b){
        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        return c;
    }
}

/* for (int i = 0; i < a.length; i++) {
c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
c[a.length + i] = b[i];
        }*/
