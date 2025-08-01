import java.util.Scanner;

public class notprime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        NotPrimeNum(a);

    }

    private static void NotPrimeNum(int[] a) {
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=2; j<a[i]; j++){
                if(a[i]%j==0){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }


}

