
import java.util.Scanner;

public class inset_string_in_string{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.next();
        int index=s.nextInt();
        System.out.print(insertword(str1,str2,index));
    }
    static String insertword(String s1,String s2,int index){
        String res="";
        for (int i =0; i < s1.length(); i++){
            if(index==i)
                res=res+s2;
            res=res+s1.charAt(i);
        }
        return res;
    }
}