import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), r, x = 0;
        while(n>0){
            r = n%10;
            x = x * 10 + r;
            n /= 10;
        }
        System.out.println(x);
    }
}
