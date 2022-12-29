package CodeChef;
import java.util.Scanner;
public class q3equalDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((x+y)%2 ==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
