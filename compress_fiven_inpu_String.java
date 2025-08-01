import java.util.*;
public class compress_fiven_inpu_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=1;
        for(int i=0;i<str.length()-1;i++)
            if(str.charAt(i)==str.charAt(i+1))
                c++;
            else if(str.charAt(i)!=str.charAt(i+1)){
                System.out.print((char)(str.charAt(i))+""+c);
                c=1;
            }
        for(int i=str.length()-1;i>0;i--){
            if(str.charAt(i)!=str.charAt(i-1)){
                System.out.print((char)(str.charAt(i))+""+c);
                break;
            }
        }
    }
}