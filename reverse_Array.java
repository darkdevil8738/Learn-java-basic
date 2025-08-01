
import java.util.Scanner;

public class reverse_Array{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for (int idx = 0; idx < arr.length; idx++) 
            arr[idx]=s.nextInt();
        for(int j=0;j<a;j++){
            if(a%2==0){
                for(int i=(a/2)-1;i>=1;i--)
                    System.out.print(arr[i]+" ");
                for(int i=a/2;i<a-1;i--)
                    System.out.print(arr[i]+" ");}
            else{
                for(int i=(a/2);i>=1;i--)
                    System.out.print(arr[i]+" ");
                for(int i=(a/2)+1;i<a-1;i--)
                    System.out.print(arr[i]+" ");}}
            }
    }

