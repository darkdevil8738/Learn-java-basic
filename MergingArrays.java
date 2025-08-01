import java.util.Scanner;

public class MergingArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        int ans[] = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (ans[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[k++] = arr[i];
            }
        }
        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (ans[j] == brr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[k++] = brr[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}