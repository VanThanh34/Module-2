package module_2.src.ss13_giai_thuat.bai_tap.tinh_do_phuc_tap;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int [] frequentChar = new int[255];   //[1]
        for (int i = 0; i < str.length(); i++) { //[2]
            int ascii =  str.charAt(i);         //[3]
            frequentChar[ascii]++;              //[4]

        }
        int max = 0;                            //[5]
        char character = 0;                     //[6]
        for (int j = 0; j < 255; j++) {         //[7]
            if (frequentChar[j] > max) {        //[8]
                max = frequentChar[j];          //[9]
                character = (char) j;           //[10]
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }

}
        /* 2 trường hợp nếu số lượng kí tự (n):
        TH1: n <= 255:
            Độ phức tạp thuật toán sẽ là max của chuỗi lệnh [1] , [2], [5], [6], [7] là O(255)
        TH2: n > 255:
            Độ phức tạp thuật toán sẽ là thời gian thực hiện vòng lặp 2 là O(n) */