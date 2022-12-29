package Diy2;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sign = sc.next();
        int b = sc.nextInt();
        
        switch(sign){
            case "+":
                System.out.println(a+b); break;
            case "-" :
                System.out.println(a-b); break;
            case "*" :
                System.out.println(a*b); break;
            case "/" :
                System.out.println(a/b); break;
            default :
                System.out.println("Invalid Sign.");
        }
    }
}
