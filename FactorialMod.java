import java.util.Scanner;

public class FactorialMod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        while(fact%10 == 0){
            fact/=10;
        }
        System.out.print(fact);
    }
}
