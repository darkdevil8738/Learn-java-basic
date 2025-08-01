import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), max=10, r;
        while(n>0){
            r = n%10;
            if(max>r)
                max = r;
            n/=10;
        }
        System.out.println(max);
    }
}
