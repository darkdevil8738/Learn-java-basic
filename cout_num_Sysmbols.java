
import java.util.Scanner;

public class cout_num_Sysmbols {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            int c=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(!(ch>=48 && ch <=57|| ch>=65 && ch<=90|| ch>=97 && ch<=122 || ch==32))
                    c++;}
            System.out.print(c);
        
    }
}
