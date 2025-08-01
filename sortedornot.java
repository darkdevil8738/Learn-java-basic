import java.util.Scanner;

public class sortedornot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        SortedArray(a);
        asscending(a);

    }
    static void SortedArray(int []a){
    int n=a.length;
    int l=1, r=1;
    for(int i=0;i<n-1;i++) {
        if(a[i]<=a[i+1])
            l++;
        else if(a[i]>=a[i+1])
            r++;
    }

    if(l==n || r==n)
        System.out.print("sorted");
    else
        System.out.print("No");
    }

    static void asscending(int a[]) {
        int s = a.length;
        int p = 0;
        for (int i = 0; i < s - 1; i++) {
            if (a[i] > a[i + 1]) {
            p=0;
                descending(a);
                break;
            }
            p = 1;

        }
        if (p == 1) {
            System.out.print(" "+" in assending");
        }
    }
    static void descending(int a[]){
        int s= a.length;
        int p=1;
        for(int i=0;i<s-1;i++){
            if (a[i]<a[i+1]){
                p=0;
                break;
            }

        }
        if(p==1){
            System.out.print(" "+" in descending");
        }


    }
}