
import java.util.Scanner;

public class remove_vowels_{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
                if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'))
                    c++;
    }
    System.out.print(c);}
}
