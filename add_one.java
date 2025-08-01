
import java.util.Scanner;

public class add_one {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        
        int num=0; 
        int base=1;
        for(int i=n-1; i>=0; i--){
            num = num+a[i]*base;
            base*=10;
        }
        num+=1;
        int m=num, c=0;
        while(m>0){
            m/=10;
            c++;
        }
        int []b = new int[c];
        for(int i=c-1; i>=0; i--){
            int r = num%10;
            b[i] = r;
            num/=10;
        }
        for (int i = 0; i < c; i++) {
            System.out.print(b[i]+" ");
        }


    }
    
}
