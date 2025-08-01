import java.util.Scanner;

public class remove_unwanted_space {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!=32){
                System.out.print(str.charAt(i));}
        s.close();
    }
}
