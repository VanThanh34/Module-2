package module_2.src.ss3_Mang_Va_Phuong_Thuc;

public class demo {
   /* public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printArray(new int[]{3, 1, 2, 6, 4, 2});
    }*/

    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values
        m(x, y); // Invoke m with arguments x and y
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }
    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 555; // Assign a new value to numbers[0]
    }
}
