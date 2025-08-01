import java.util.Scanner;

public class Reverve_Array_first_second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        Reverse(a);
        //FirstHalfRev(a);
        //SecondHalfRev(a);
        //FirstSecondSeparately(a);

    }
    static void Reverse(int []a){
        int n = a.length;
        int l = n-1;
        for(int i=0; i<n/2; i++){
            int t = a[i];
            a[i] = a[l];
            a[l] = t;
            l--;
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }

    static void FirstHalfRev(int []a){
        int n = a.length;
        int l = n/2;
        for(int i=0; i<l; i++){
            int t = a[i];
            a[i] = a[l-1];
            a[l-1] = t;
            l--;
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }

    static void SecondHalfRev(int []a){
        int n = a.length;
        int l = n-1;
        for(int i=n/2; i<l; i++){
            int t = a[i];
            a[i] = a[n-1];
            a[n-1] = t;
            l--;
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }

    static void FirstSecondSeparately(int []a){
        int n = a.length;
        int f = 0, l = n/2, k=2;
        while(k>0){
            for(int i=f; i<l; i++){
                int t = a[i];
                a[i] = a[l-1];
                a[l-1] = t;
                l--;
            }
            k--;
            f = n/2;
            l = n;
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }
}
