import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a=0, r, base=1, k = s.nextInt();
        while(n > 0){
            r = n%10;
            if(r==k){
                n/=10;
                continue;
            }
            a = a + base * r;
            base*=10;
            n/=10;
        }
        System.out.println(a);
    }
}
