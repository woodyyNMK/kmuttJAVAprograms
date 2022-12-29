package Cscms;
import java.util.Scanner;
public class cs80DeciToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(deciToOctal(input));
    }
    public static String deciToOctal(int a){
        if(a < 8){
            return ""+a ;
        }else{
            return deciToOctal(a/8)+a%8;
        }
    }
}
