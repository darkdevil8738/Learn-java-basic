import java.util.Scanner;
public class check_two_string_without_case{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String newStr1 = "";
        String newStr2 = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            newStr1 += ch;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            newStr2 += ch;
        }
        if (newStr1.length() == newStr2.length()) {
            int p = 1;
            for (int i = 0; i < newStr1.length(); i++) {
                if (newStr1.charAt(i) != newStr2.charAt(i)) {
                    p = 0;
                    break;
                }
            }
            if (p == 1)
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        else {
            System.out.print("Not Same");
        }
    }
}