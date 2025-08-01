
import java.util.Scanner;

public class biary_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int mid=a[n/2];
        int k=s.nextInt();
        int l=a[0],h=a[n-1];
        while(l<=h){
            if(k==mid){
                System.out.println("YEs");
                return;}
            if(k<mid)
                h=mid-1;
            if(k>mid)
                l=mid+1;
        }
        if(mid!=k)
        System.out.print("NO");
    }
}
