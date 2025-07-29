package ss11_stack_queue.bai_tap.convert_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        while (s > 0) {
            stack.push(s % 2);
            s = s / 2;
        }

        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
