
import java.util.Scanner;
_
public class largest_palindrome_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        int min=-1,max=-1,f=0;
        for(int i=0;i<str.length;i++){
            if(ispalindrome(str[i])){
                f++;
                if(f==1){
                    min=i;
                    max=i;
                }
                else{
                    if(str[min].length()>str[i].length())
                        min=i;
                    if(str[max].length()<str[i].length())
                        max=i;
                }
            }
        }
        System.out.print(str[min]+" "+str[max]);
    }
    static boolean ispalindrome(String a){
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

