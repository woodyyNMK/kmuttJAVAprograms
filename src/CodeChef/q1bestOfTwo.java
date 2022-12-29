package CodeChef;
import java.util.Scanner;
public class q1bestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(Math.max(x,y));
        }
    }
}
