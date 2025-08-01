
import java.util.Scanner;

public class pangram_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.print(ispangram(str));
    }
    static String ispangram(String s){
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
                a[ch-97]++;
            else if(ch>='A'&&ch<='Z')
                a[ch-65]++;
        }
        for(int i=0;i<a.length;i++)
            if(a[i]==0)
                return "NO";
        return "YES";
    }
}
