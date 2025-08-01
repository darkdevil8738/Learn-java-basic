
import java.util.Scanner;

public class convert_to_lower {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.print((char)(str.charAt(i)+32));
            }
            else
            System.out.print(str.charAt(i));
        }
    }
}