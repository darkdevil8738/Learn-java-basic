import java.util.Scanner;
public class mamin_index{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int max=a[0],min=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i])
                max=a[i];
            else if(min>a[i])
                min=a[i];}
        for(int i=0;i<n;i++){
            if(max==a[i])
                System.out.println(i);
            else if(min==a[i])
                System.out.print(i);}

    }
    
}

