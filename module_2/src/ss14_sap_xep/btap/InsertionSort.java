package ss14_sap_xep.btap;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,3,6,5,2,1,7};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }


}
