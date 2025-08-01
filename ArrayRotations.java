import java.util.Scanner;

public class ArrayRotations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();

        //LeftRotation(a);
        RightRotation(a);
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }
    private static void RightRotation(int a[]) {
        int n = a.length;
        int t = a[n-1];
        for(int i=n-1; i>0; i--)
            a[i] = a[i-1];
        a[0] = t;
    }
}
