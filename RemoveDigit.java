import java.util.Scanner;

public class RemoveDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(), base=1, k = s.nextInt(), r, a =0;
        while(n>0){
            r = n%10;
            if(r==k) {
                n /= 10;
                continue;
            }
            a = a + base * r;
            n/=10;
            base*=10;
        }
        System.out.println(a);
    }
}
