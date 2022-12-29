package Recursive;
import java.util.Scanner;
public class RecursiveLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();

        System.out.println(logRecur(a,b));
    }
    public static int logRecur(int a, int b){
        if(a == 1)
            return 0;
        else
            return logRecur(a/b,b) + 1;
    }
}
