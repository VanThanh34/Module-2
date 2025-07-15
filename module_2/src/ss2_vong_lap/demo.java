package module_2.src.ss2_vong_lap;

//import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Mời nhập vào số thứ hai: ");
        int num2 = sc.nextInt();
        System.out.print("Mời nhập vào kết quả: ");
        int kq = sc.nextInt();
        while (num1 + num2 != kq) {
            System.out.println("Bạn đã nhập sai kết quả");
            System.out.print("Mời bạn nhập lại kết quả: ");
            kq = sc.nextInt();
        }
        System.out.println("Bạn đã nhập đúng!!!");*/

     /*   int [] array = {1,2,3,4,5,6,7,8,9};
        for(int i: array){
            System.out.println("i: "+i);
        }*/
      /*  int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!" +count);
            count++;
        }*/
        System.out.println(" Multiplication Table");

        //Display the number title
        System.out.print(" ");
        for (int j = 1; j <= 9; j++)
            System.out.print(" " + j);

        System.out.println("\n———————————————————————————————————————");
        //Display table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
