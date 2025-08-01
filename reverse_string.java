import java.util.Scanner;
public class reverse_string{
    public static void main(String arg[]){
    Scanner s= new Scanner(System.in);
    String str=s.nextLine();
    int c=0;
    for(int i=str.length()-1;i>=0;i--){
        if(str.charAt(i)==' '){
                for(int j=i+1;c>0;j++,c--)
                    System.out.print(str.charAt(j));
                System.out.print(" ");
        }
        else
        c++;
    }
    for(int j=0;c>0;j++,c--)
        System.out.print(str.charAt(j));
    }
}