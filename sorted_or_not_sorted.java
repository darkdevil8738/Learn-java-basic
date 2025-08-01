import java.util.Scanner;
public class sorted_or_not_sorted{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int p=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                System.out.print("NO");
                p=1;
                break;
            }
        }
        if(p==0)
        System.out.print("YES");
    }
}
