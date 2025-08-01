import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        int k = s.nextInt();
        BinSearch(a,k);

        /*
        int found=0,f=0,l=n;
        while(found==0 && l!=f) {
            int mid = (f + l) / 2;
            if (a[mid] == k) {
                System.out.print("found");
                found = 1;

            } else if (k > a[mid])
                f = mid + 1;
            else if (k < a[mid])
                l = mid - 1;
        }
        if(found==0)
            System.out.print("no");
        */

    }

    static void BinSearch(int []a, int k){
        int n = a.length;
        int i = 0, f = n-1;
        while(i<=f){
            int mid = (i+f)/2;
            if(a[mid]==k){
                System.out.println("yes");
                return;
            }
            else if(a[mid]>k){
                f = mid-1;
            }
            else if(a[mid]<k){
                i = mid+1;
            }
        }
        System.out.println("no");
    }

    static void LinearSearch(int []a, int k){
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]==k ){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
