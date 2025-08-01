
import java.util.*;

public class kish {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
            String str=s.nextLine();
            int d=0;
            char ch=str.charAt(0);
            for(int i=0;i<str.length();i++)
                {
                    if(ch==str.charAt(i))
                        d++;
                    else 
                    {
                        System.out.print(ch+""+d);
                        d=1;
                        ch=str.charAt(i);
                    }
                }
            for(int i=str.length()-1;i>0;i--){
                if(str.charAt(i)!=str.charAt(i-1)){
                    System.out.print(str.charAt(i)+""+d);
                    break;
                }
            }
        
    }
}
