
import java.util.Arrays;
import java.util.Scanner;

public class kthmin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int k=s.nextInt();
        Arrays.sort(a);//1 2 3 4 5      k=2        k-1=1->index
            System.out.print(a[k-1]);

    }
}
