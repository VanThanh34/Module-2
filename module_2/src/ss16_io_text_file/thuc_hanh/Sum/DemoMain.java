package ss16_io_text_file.thuc_hanh.Sum;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        System.out.print("Nhập vào đưường dẫn File: ");
        Scanner sc = new Scanner(System.in);
        String link = sc.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(link);
    }


}
