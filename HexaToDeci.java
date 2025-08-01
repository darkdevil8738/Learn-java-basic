import java.util.Scanner;
public class HexaToDeci {
    public static int hextodeci(String hex){
        int decimal = 0;
        int base = 1;
        for(int i=hex.length()-1; i>=0; i--){
            char ch = hex.charAt(i);
            int value;
            if(ch>='0' && ch<='9')
                value = ch-'0';
            else if(ch>='A' && ch<='F')
                value = ch-'A'+10;
            else{
                System.out.println("Invalid");
                return -1;
            }
            decimal = decimal+ value*base;
            base*=16;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String hex = s.next();
        int decimal = hextodeci(hex);
        if(decimal!=1)
            System.out.println(decimal);
        s.close();
    }
}
