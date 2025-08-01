import java.util.Scanner;
public class first_half_reverse_and_adding_ele_of_even_index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int mid = n / 2;
        for(int i = 0; i < mid / 2; i++) {
            int temp = a[i];
            a[i] = a[mid - 1 - i];
            a[mid - 1 - i] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < n; i += 2) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}