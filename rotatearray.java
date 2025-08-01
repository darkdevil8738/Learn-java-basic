
import java.util.Scanner;

public class rotatearray{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        rotate(a,k);
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
    }
    public static void rotate(int a[],int k){
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);

    }
    public static void reverse(int a[],int i,int j){
        while(i<j){
            int t =a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
}
