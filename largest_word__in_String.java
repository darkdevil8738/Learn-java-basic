
import java.util.Scanner;

public class largest_word__in_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        int min=0,max=0;
        for(int i=1;i<str.length;i++){
                    if(str[min].length()>str[i].length())
                        min=i;
                    if(str[max].length()<str[i].length())
                        max=i;
                }
        System.out.print(str[max]+" "+str[min]);
}
}
