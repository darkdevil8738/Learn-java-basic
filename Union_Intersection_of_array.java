import java.util.Scanner;

public class Union_Intersection_of_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int m = s.nextInt();
        int []b = new int[m];
        for(int i=0; i<m; i++)
            b[i] = s.nextInt();
        UniqueEle(a,b);
    }

    static void UniqueEle(int[] a, int []b) {
        int n = a.length, m = b.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i])
                max = a[i];
        }
        for (int i = 1; i < m; i++) {
            if (max < b[i])
                max = b[i];
        }

        int[] c = new int[max + 1];
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        for (int i = 0; i <m; i++) {
            c[b[i]]++;
        }
        System.out.print("\nUnion: ");
        for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
        }
        for (int i = 0; i < m; i++) {
            if (c[b[i]]==1)
                System.out.println(b[i]+" ");
        }
        System.out.print("\nIntersection: ");
        for (int i = 0; i <n; i++) {
            if(c[a[i]]>1)
                System.out.print(a[i]+" ");
        }
        System.out.print("\nExcept: ");
        for (int i=0; i<n; i++) {
            if (a[i] % 2 == 1)
                System.out.print(a[i] + " ");
        }
        for (int i=0; i<m; i++) {
            if (b[i] % 2 == 0)
                System.out.print(b[i] + " ");
        }

    }
}
