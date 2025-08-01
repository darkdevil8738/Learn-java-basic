import java.util.Scanner;

public class Threshold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int t = s.nextInt();
        int c =0;
        int sum=0;
        for(int i=0; i<n; i++){
            c= a[i]/t;
            if(a[i]%t!=0)
                c+=1;
            sum+=c;
        }
        System.out.println(sum);
    }
}
