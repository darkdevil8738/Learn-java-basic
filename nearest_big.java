import java.util.Scanner;

public class nearest_big{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int max = a[0],min=a[0];
        for(int i=1; i<n ; i++){
            if(max<a[i]){
                max=a[i];
            }
            else if(min>a[i])
                min=a[i];
        }
        int b[]=new int[max+1];
        for(int i=0;i<n;i++)
            b[a[i]]++;
        max=2147483647;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j]>a[i] && a[j]<max){
                    max=a[j];
                }
            }
        if(max!=2147483647)
            System.out.print(a[i]+"<"+max+",");
        max=Integer.MAX_VALUE;
    }
}
}