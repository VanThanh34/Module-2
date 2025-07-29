package ss11_stack_queue.bai_tap.stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        //Đảo ngược phần tử trong mảng số nguyên

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of Stack Integer: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            stack.push(arr[i]);
        }
        System.out.print("Stack is: ");
        System.out.println(stack);

        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Reversed Stack is: " + Arrays.toString(arr));

        //Đảo ngược chuỗi
        Stack<String> stack1 = new Stack<>();
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter elements of Stack String: ");
        String m = scc.nextLine();
        String[] arr1 = m.split(" ");
        for (String s1 : arr1) {
            stack1.push(s1);
        }
        System.out.print("Reversed Stack: ");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop() + " ");
        }
        }
    }

