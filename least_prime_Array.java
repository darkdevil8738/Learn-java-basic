import java.util.Scanner;
public class least_prime_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[2];
        int[] b = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            int prime = 2;
            while (true) {
                if (isPrime(prime) && (a[i] + prime) % b[i] == 0) {
                    System.out.print(prime + " ");
                    break;
                }
                prime++;
            }
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}