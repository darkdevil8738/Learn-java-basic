import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt(), n2 = s.nextInt(), r=1;
        /*
        int x=n1, y=n2;
        if(n1!=n2){
            while(r!=0){
                r= n1%n2;
                if(r!=0){
                    n1 = n2;
                    n2 = r;
                }
            }
            System.out.println("HCF: "+n2);
            System.out.println("LCM: "+((x*y)/n2));
        }
        else
            System.out.println("LCM % HCF: "+n2);*/
        int max;
        if(n1>n2)
        {
            max=n1;
        }
        else
        {
            max=n2;
        }
        int c=0,flag=0;
        for(int i=1;i<(max*10);i++)
        {
            if(i%n1==0 && i%n2==0) {
                flag = 1;
                c = i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print(c);
        }
    }
}
