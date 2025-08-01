
import java.util.Scanner;

public class leftrotation{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
    while(m>0){
        int t=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
            System.out.print(a[i]+"|");}
        a[0]=t;
        m--;
    }
    for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    
    }
}