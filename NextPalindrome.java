import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=n; ;i++){
            int m=n, r, rev=0;
            while(m>0){
                r = m%10;
                rev = rev * 10 +r;
                m/=10;
            }
            if(rev==i){
                System.out.println(m);
                return;
            }
        }
    }
}
