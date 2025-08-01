
import java.util.Scanner;

public class anagram_or_not{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int A1[]=new int[128];
        int A2[]=new int[128];
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                A1[str1.charAt(i)]++;
                A2[str2.charAt(i)]++;}
        
            for(int i=0;i<A1.length;i++){
                if(A1[i]!=A2[i])
                    System.out.print("No");
                    break;
            }
            System.out.print("Yes");
        }
        else 
            System.err.print("No");
    }
}