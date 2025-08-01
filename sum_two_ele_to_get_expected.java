import java.util.Scanner;
public class sum_two_ele_to_get_expected{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        int k=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=a[i]+a[j];
                if(sum==k){
                    System.out.print("yes");
                }
                }
            }
        
        if(sum!=k)
            System.out.print("no");
        }
    }
