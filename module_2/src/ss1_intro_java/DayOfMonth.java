package module_2.src.ss1_intro_java;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String daysInMonth;
        System.out.println("Tháng nào bạn muốn đếm ngày? ");
        System.out.print("Tháng: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                System.out.println("Không có tháng này!!!");


        }
        if(!daysInMonth.isEmpty()){
            System.out.printf("Tháng '%d' có %s ngày", month, daysInMonth);
        }else System.out.println("Không có tháng này!!!");
    }
}
