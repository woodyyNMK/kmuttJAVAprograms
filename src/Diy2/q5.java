package Diy2;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String st = input.toLowerCase();

        for(int a = st.length()-1; a>=0 ; a--){
            System.out.print(st.charAt(a));
        }

    }
}
