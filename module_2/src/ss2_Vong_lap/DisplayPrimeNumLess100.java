package module_2.src.ss2_Vong_lap;

public class DisplayPrimeNumLess100 {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int n = 2; n < 100; n++) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
