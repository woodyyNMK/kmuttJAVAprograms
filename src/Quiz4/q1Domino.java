package Quiz4;
import java.util.Scanner;
public class q1Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (a*b)/2;
        System.out.println(result);
    }
}
