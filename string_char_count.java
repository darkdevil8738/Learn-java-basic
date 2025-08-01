
import java.util.Scanner;

public class string_char_count {
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int n=str.length();
    int c=0;
    for(int i=0;i<n;i++)
        c++;
    System.out.print(c);
}
}

