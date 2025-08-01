import java.util.Scanner;

public class buble_sort {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-1-j;i++)
            {
                if(a[i]>a[i+1])
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
