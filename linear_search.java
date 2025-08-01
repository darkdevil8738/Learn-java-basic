
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int k=s.nextInt();
        int p=0;
        for(int i=0;i<n;i++){
            if(k==a[i]){
                System.out.print("yes");
                p=1;
                break;
            }
            }
        if(p==0)
            System.out.print("NO");
    }
    
}
