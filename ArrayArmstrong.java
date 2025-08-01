import java.util.Scanner;

public class ArrayArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();

        for(int i=0; i<n; i++){
            Armstroong(a[i]);
        }
    }

    private static void Armstroong(int n) {
        int m=n, count=0;
        while(n>0){
            count++;
            n/=10;
        }
        n=m;
        int p=1, r, sum = 0;
        while(n>0){
            r = n%10;
            for(int i=0; i<count; i++){
                p*=r;
            }
            sum += p;
            p=1;
            n /= 10;
        }
        if(m==sum)
            System.out.print(m+" ");
    }
}
