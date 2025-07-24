package module_2.src.ss15_exception.btap;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập cạnh b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập cạnh c: ");
            int c = Integer.parseInt(sc.nextLine());

            checkTriangle(a, b, c);
            System.out.println("Tam giác hợp lệ!");

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Bạn phải nhập số nguyên!");
        }
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
    }
}


