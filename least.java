import java.util.Scanner;

public class least {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 2;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for (int i = 0; i < n; i++)
            b[i] = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int z = 2; z < 1000; z++) {
                if (isPrime(z)) {
                    if ((a[i] + z) % b[i] == 0) {
                        System.out.print(z + " ");
                        break;
                    }
                }
            }
        }
    }

    private static boolean isPrime(int d) {
        if (d < 2) return false;
        for (int i = 2; i * i <= d; i++) {
            if (d % i == 0)
                return false;
        }
        return true;
    }
}
