import java.util.Scanner;
class AlternateSorting{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] =s.nextInt();
        }
        int l = a.length;
        int max = a[0], min = a[0];
        for(int i=1; i<l; i++){
            if(max < a[i])
                max = a[i];
            else if(min > a[i])
                min = a[i];
        }
        int []b = new int[max+1];
        for(int i=0; i<l; i++){
            b[a[i]]++;
        }
        while(max>min){
            System.out.print(max+" "+min+" ");
            min++;
            max--;
            while(b[max]==0)
                max--;
            while(b[min]==0)
                min++;
        }
    }
}
