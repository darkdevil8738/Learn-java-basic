import java.util.Scanner;

public class convert_to_uper {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                System.out.print((char)(str.charAt(i)-32));
            }
            else
            System.out.print(str.charAt(i));
        }
    }
}