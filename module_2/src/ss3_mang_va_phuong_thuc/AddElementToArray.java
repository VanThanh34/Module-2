package module_2.src.ss3_mang_va_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Mảng hiện có: " + Arrays.toString(arr));

        int[] result = addElement(arr);
        System.out.println("Mảng sau khi thay đổi là: " + Arrays.toString(result));
    }

    public static int[] addElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số cần chèn là: ");
        int n = sc.nextInt();
        System.out.print("Vị trí bạn muốn chèn là: ");
        int x = sc.nextInt();
        if (x <= 0 || x > arr.length) {
            System.out.println("Không chèn được phần tử vào mảng");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, x);
        newArr[x] = n;
        System.arraycopy(arr, x, newArr, x + 1, arr.length - x + 1);

        return newArr;
    }

}
