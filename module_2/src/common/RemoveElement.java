package common;

import java.util.Scanner;

public class RemoveElement {
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
