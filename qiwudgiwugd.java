import java.util.*;
public class qiwudgiwugd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int i=0,j=n/2,k=(n/2)+1,l=n-1;
        while(i<j|| k<l)
        {
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(k<j){
                int tem=a[k];
                a[k]=a[l];
                a[l]=tem;
            }
        }
        for(int m=0;m<n;m++)
            System.out.print(a[m]+" ");
}
}
