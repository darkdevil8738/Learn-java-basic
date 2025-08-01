import java.util.Scanner;

public class StringNonRepeating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        int n = str.length();
        int i=n-1, c=0;
        while(str.charAt(i) == ' ') {
            i--;
        }
        while(str.charAt(i) != ' ') {
            c++;
            i--;
        }
        System.out.println(c);
    }
}