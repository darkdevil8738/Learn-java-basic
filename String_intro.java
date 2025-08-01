import java.util.Scanner;
public class String_intro{
public static void main(String ar[]){
    Scanner s= new Scanner(System.in);
    String a=s.nextLine();
    for(int i=0;i<a.length();i++)
        System.out.print(a.charAt(i));
    System.out.print("\n");
    for(int i=a.length()-1;i>=0;i--)
        System.out.print(a.charAt(i));
    }
}