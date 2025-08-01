
import java.util.Scanner;

public class count_sp{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch==' ')
                c++;
    }
    System.out.print(c);}
}