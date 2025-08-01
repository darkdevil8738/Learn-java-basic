
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        for(int i=0;i<s1.length();i++){
            if(s2.charAt(0)==s1.charAt(i)){
                int f=0;
                for(int j=0;j<s2.length();j++,i++)
                    if(s1.charAt(i)==s2.charAt(j))
                        f++;
                if(f==s2.length())
                    System.out.println(i-f);
                i--;
            }
        }
    }
}
