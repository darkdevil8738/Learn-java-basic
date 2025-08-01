import java.util.Scanner;
public class max_occerence{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        Hashing(n);
    }

    public static void Hashing(String s1){
        int n = s1.length();
        int []b = new int[128];
        for(int i=0; i<n; i++){
            b[s1.charAt(i)]++;
        }
        int max=0;
        char ch='0';
        for(int i=0; i<n; i++){
            if (b[s1.charAt(i)]>max) {
                ch=s1.charAt(i);
                max=b[s1.charAt(i)];
            }
        }
        System.out.print(max+" "+ch);
    }
}

