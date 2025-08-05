package ss1_intro_java;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số (từ 0 đến 999): ");
        int n = sc.nextInt();

        if (n < 0 || n > 999) {
            System.out.printf("%d không có trong khoảng", n);
            return;
        }
        if (n == 0) {
            System.out.println("zero");
            return;
        }

        int hundred = n / 100;
        int rest = n % 100;
        int ten = rest / 10;
        int unit = rest % 10;

        String result = "";

        switch (hundred) {
            case 1: result += "one hundred"; break;
            case 2: result += "two hundred"; break;
            case 3: result += "three hundred"; break;
            case 4: result += "four hundred"; break;
            case 5: result += "five hundred"; break;
            case 6: result += "six hundred"; break;
            case 7: result += "seven hundred"; break;
            case 8: result += "eight hundred"; break;
            case 9: result += "nine hundred"; break;
        }

        if (hundred > 0 && rest != 0) {
            result += " and ";
        }

        if (rest >= 10 && rest < 20) {
            switch (rest) {
                case 10: result += "ten"; break;
                case 11: result += "eleven"; break;
                case 12: result += "twelve"; break;
                case 13: result += "thirteen"; break;
                case 14: result += "fourteen"; break;
                case 15: result += "fifteen"; break;
                case 16: result += "sixteen"; break;
                case 17: result += "seventeen"; break;
                case 18: result += "eighteen"; break;
                case 19: result += "nineteen"; break;
            }
        } else {
            switch (ten) {
                case 2: result += "twenty"; break;
                case 3: result += "thirty"; break;
                case 4: result += "forty"; break;
                case 5: result += "fifty"; break;
                case 6: result += "sixty"; break;
                case 7: result += "seventy"; break;
                case 8: result += "eighty"; break;
                case 9: result += "ninety"; break;
            }

            if (ten >= 2 && unit != 0) {
                result += " ";
            }

            if (ten != 1) {
                switch (unit) {
                    case 1: result += "one"; break;
                    case 2: result += "two"; break;
                    case 3: result += "three"; break;
                    case 4: result += "four"; break;
                    case 5: result += "five"; break;
                    case 6: result += "six"; break;
                    case 7: result += "seven"; break;
                    case 8: result += "eight"; break;
                    case 9: result += "nine"; break;
                }
            }
        }

        System.out.println("Đọc là: " + result);
    }
}
