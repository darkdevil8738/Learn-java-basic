import java.util.Scanner;
public class count_num_of_digit_in_String{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String srt=s.nextLine();
        int c=0;
        for(int i=0;i<srt.length();i++){
            if(srt.charAt(i)>=48 && srt.charAt(i)<=57)
                c++;
    }
    System.out.print(c);
}
}
