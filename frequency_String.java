import java.util.Scanner;

public class frequency_String{
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
        for(int i=0; i<n; i++){
            if (b[s1.charAt(i)]>0) {
                System.out.println(s1.charAt(i)+ "-" + b[s1.charAt(i)]);
                b[s1.charAt(i)] = 0;
            }

        }
    }
}
