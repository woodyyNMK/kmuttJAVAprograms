package Recursive;
import java.util.Scanner;
public class RecursiveBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(BinaryNumber(input));
    }
    public static String BinaryNumber(int i){
        if(i < 2)
            return ""+i;
        else
            return BinaryNumber(i/2) + i%2;
    }
}