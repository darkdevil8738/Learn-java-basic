import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), r, count = 0, m=n, ams=0;

        while(n>0){
            count++;
            n/=10;
        }
        int p = 1;
        n = m;
        while(n>0){
            r = n%10;
            for(int i=1; i<=count; i++){
                p *= r;
            }
            ams+=p;
            p = 1;
            n /= 10;
        }
        if(ams == m){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");

        }
    }
}
