import java.util.Scanner;

public class LeastPrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int[]b=new int[n];
        for(int i=0;i<n;i++)
            b[i]=s.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int z=1;z<1000;z++)
                if(isPrime(z))
                {
                    for(int j=0;j<n;j++) {
                        if ((a[j] + z) % b[j] == 0) {
                            System.out.print(i+" ");
                            break;
                        }
                    }
                }
        }
    }

    private static boolean isPrime(int d) {
        if(d==1 || d==2)
            return true;
        for(int i=2; i<d; i++){
            if(d%i==0)
                return false;
        }
        return true;
    }
}
