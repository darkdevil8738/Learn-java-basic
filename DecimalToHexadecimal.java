import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void printHex(int n) {
        if(n==0)
            return;
        int r=n%16;
        printHex(n/16);
        if(r<10)
            System.out.print(r);
        else
            System.out.print((char) ('A' + (r - 10)));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0)
            System.out.print(0);
        else
            printHex(n);
        System.out.println();
        s.close();
    }
}
