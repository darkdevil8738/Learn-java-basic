import java.util.Scanner;

public class compare_two_String_withoutcase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String s1 = "";
        String s2 = "";
        
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            s1=s1+ch;
        }
    
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            s2=s2+ch;
        }
        if (s1.length() == s2.length()) {
            int p = 1;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    p = 0;
                    break;
                }
            }
            if (p == 1)
                System.out.print("Yes");
            else
                System.out.print("No");
        }
        else {
            System.out.print("No");
        }
    }
}
