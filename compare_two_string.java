
import java.util.Scanner;

public class compare_two_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int p=1;
        int a[]=new int[128];
        int b[]=new int[128];
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>=65 && str1.charAt(i)<=90)
                a[str1.charAt(i)]++;
        }
        for(int j=0;j<str2.length();j++){
            if(str2.charAt(j)>=65&&str2.charAt(j)<=90)
                b[str2.charAt(j)]++;
        
        }
        if(str1.length()==str2.length()){
            for(int j=0;j<128;j++){
                    if((a[j]!=b[j])){
                        p=0;
                        break;
                    }
            }
        }
        else {
            p=0;
        }
        if(p==1)
            System.out.print("Yes");
        else
        System.out.print("No");
    }
}
