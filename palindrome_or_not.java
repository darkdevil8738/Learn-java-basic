import java.util.Scanner;

public class palindrome_or_not {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(ispalindrome(str))
            System.out.print("palindrome");
        else
        System.out.print("not palindrome");
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