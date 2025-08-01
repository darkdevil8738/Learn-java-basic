import java.util.Scanner;

public class DifferenceOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        DiffOddEven(a);
    }

    public static int SumOdd(int []a) {
        int n = a.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(a[i]%2!=0)
                sum+=a[i];
        }
        return sum;
    }

    public static int SumEven(int []a) {
        int n = a.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(a[i]%2==0)
                sum+=a[i];
        }
        return sum;
    }

    public static void DiffOddEven(int []a){
        int even = SumEven(a);
        int odd = SumOdd(a);
        int d;
        if(even>odd){
            d = even - odd;
        }
        else{
            d = odd - even;
        }
        System.out.println(d);
    }
}
