package module_2.src.ss3_Mang_Va_Phuong_Thuc;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        System.out.println("Mảng hiện có: " + Arrays.toString(arr));
        int n;
        System.out.print("Nhập phần tử cần xóa: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Vị trí của phần tử cần xóa là: " + i);
                for (int j = i ; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
                arr[arr.length-1] = 0;
                }
                System.out.println("Mảng sau khi thay đổi: "+Arrays.toString(arr));
            }
        }
    }
}

