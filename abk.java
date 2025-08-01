import java.util.*;

public class abk {
    public static void main(String arg[]){
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int a[]=new int[n];

    for(int i=0;i<n;i++)
        a[i]=s.nextInt();
    int m=s.nextInt();
    int b[]=new int[m];
    for(int i=0;i<m;i++)
        b[i]=s.nextInt();
    if(m>n){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i]==b[j])
                b[j]='$';
        }
    }
    for(int i=0;i<m;i++)
        if(b[i]!='$')
            System.out.println(b[i]);}
    
}}
