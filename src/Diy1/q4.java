package Diy1;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.length());
        System.out.println(st.charAt(2));
        System.out.println(st.substring(2));
    }
}
