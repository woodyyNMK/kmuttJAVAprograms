package CodeChef;
import java.util.Scanner;
public class q4bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>c)
                System.out.println("Alice");
            else if(b>a && b>c)
                System.out.println("Bob");
            else if(c>a && c>b)
                System.out.println("Charlie");
        }
    }
}
