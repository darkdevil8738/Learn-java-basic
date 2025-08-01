import java.util.*;
public class factorial_of_num{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int smin=a[0];
        for(int i=1;i<size;i++)
        {
            if(a[i]<min){
                min=a[i];
            }
        }
            for(int i=1;i<size;i++){
                if(a[i]!=min){
                if(a[i]<smin){
                    smin=a[i];
                }}
            }
    System.out.print(smin);
}
}