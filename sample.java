
import java.util.Scanner;

public class sample{
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in);
        String str="kishjjj";
        int a[]=new int[str.length()];
        for(int i=0 ;i<str.length();i++)
            a[i]=str.charAt(i);
        int i=0;
        int j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for(i=0;i<a.length;i++)
            System.out.print((char)(a[i]));
    }
    
}