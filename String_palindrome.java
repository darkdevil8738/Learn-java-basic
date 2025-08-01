import java.util.*;
public class String_palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        int i=0, j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.print("no");
                return;}
            else{
            i++;
            j--;
        }
        }
        System.out.println("Yes");
}
}