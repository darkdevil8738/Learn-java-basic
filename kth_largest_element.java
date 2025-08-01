
import java.util.Scanner;

public class kth_largest_element{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
            else if(min>a[i]){
                min=a[i];
            }
        }
        int b[]=new int[max+1];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        int k=s.nextInt();
        int t=max;
        int r=0;
        int p=1;
        while(k>0){
            if(b[t]>0){
                r=t;
                k--;
                p=0;
            }
            t--;

        }
        System.out.print(r);
        if(p==1){
            System.out.print("-1");
        }
    
    }
}
