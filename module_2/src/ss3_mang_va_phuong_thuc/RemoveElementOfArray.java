package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        System.out.println("Mảng hiện có: " + Arrays.toString(arr));

        int[] arr1 =removeElement(arr);
        System.out.println("Mảng sau khi thay đổi: " + Arrays.toString(arr1));

    }
    public static int[] removeElement(int[] arr){
        System.out.print("Nhập phần tử cần xóa: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Vị trí của phần tử cần xóa là: " + i);
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        return arr;
    }
}


