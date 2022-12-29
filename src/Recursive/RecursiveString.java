package Recursive;
import java.util.Scanner;
public class RecursiveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(numString(input));
    }

    public static String numString(int i){
        if(i==1)
            return "1";
        else
            return repeat(i,i)+numString(i-1)+repeat(i,i);
    }

    public static String repeat(int a, int b){
        if(b==0)
            return "";
        else
            return repeat(a,b-1)+ a;
    }
}
