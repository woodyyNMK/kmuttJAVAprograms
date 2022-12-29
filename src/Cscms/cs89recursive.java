package Cscms;
import java.util.Scanner;
public class cs89recursive {
    public static String printUpper(String st){
        
        if(st.length()==0){
            return "";
        }else{
            if(st.charAt(0)<97){
                return st.charAt(0)+printUpper(st.substring(1));
            }else{
                return printUpper(st.substring(1));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(printUpper(st));
    }
}
