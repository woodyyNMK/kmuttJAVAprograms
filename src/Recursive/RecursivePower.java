package Recursive;
import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
    public static int power(int a, int b){
        if(b==0)
            return 1;
        else
            return power(a,b-1)*a;
    }

}
