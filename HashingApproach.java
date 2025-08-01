import java.util.Scanner;

public class HashingApproach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int k = s.nextInt();
        UniqueEle(a, k);
    }

    static void UniqueEle(int[] a, int k) {
        int n = a.length;
        int max = a[0], min = a[0];
        for(int i=1; i<n; i++){
            if(max<a[i])
                max = a[i];
            else if(min>a[i])
                min = a[i];
        }
        int []b = new int[max+1];
        for(int i=0; i<n; i++){
            b[a[i]]++;
        }
        /*
        for(int i=0; i<=max; i++) {
            if(b[i]!=0)
                System.out.print(i + " ");
        }
         */
        int c=k, m=0;
        while(c>0){
            for(int i=max-1; i>=0; i--){
                if(b[i]!=0){
                    m = i;
                    if(c==k){
                        System.out.println(m);
                        return;
                    }
                    c--;
                }
            }
        }
    }
}
