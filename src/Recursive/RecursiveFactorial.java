package Recursive;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    
        System.out.println(Factorial(input));
    }
    public static int Factorial(int i){
        if(i == 0)
            return 1;
        else
            return Factorial(i-1) * i;
    }
}
