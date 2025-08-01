import java.util.Scanner;

public class SlidingProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i =0; i<n; i++)
            a[i] = s.nextInt();
        int k = s.nextInt();
        for(int i=0; i<=n-k; i++){
            int min = a[i];
            for(int j=i; j<=i; j++) {
                if (min > a[j]) {
                    min = a[j];
                }
            }
            System.out.print(min+ " ");
        }
    }
}
