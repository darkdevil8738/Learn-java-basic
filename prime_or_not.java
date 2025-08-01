import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        isPalindrome(a);

    }
    public static void isPalindrome(int []a) {
        int n = a.length;
        int l = n-1;
        for(int i=0; i<n/2; i++){
            if(a[i]==a[l]) {
                l--;
                continue;
            }
            else{
                System.out.println("no");
                return;
            }

        }
        System.out.println("yes");
    }

}
