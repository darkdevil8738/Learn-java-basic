import java.util.Scanner;
public class tamil {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int n=s.length();
        String r="";
        for(int i=0;i<n;i++){
            char t=s.charAt(i);
            if (i == 0 || s.charAt(i - 1) == ' ') {
                int d=t-32;
                t=(char)d;
                r=r+t;
                continue;

            }
            r=r+t;
        }
        System.out.print(r);

    }
    
}
