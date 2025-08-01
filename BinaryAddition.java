import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b1 = s.nextInt(), b2 = s.nextInt(), r=0, i = 0;
        int []sum = new int[10];
        while(b1>0 || b2>0){
            sum[i++] = (b1%10 + b2%10 +r)%2;
            r = (b1%10 + b2%10 +r)/2;
            b1/=10;
            b2/=10;
        }
        if(r!=0){
            sum[i++] = r;
        }
        for(int j=i-1; j>=0; j--){
            System.out.print(sum[j]);
        }
    }
}
