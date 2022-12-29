package CodeChef;
import java.util.Scanner;
public class q2rainInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-- >0){
            int input = sc.nextInt();

            if(input<3){
                System.out.println("LIGHT");
            }else if(input>=3 && input<7){
                System.out.println("MODERATE");
            }else if(input >=7){
                System.out.println("HEAVY");
            }
        }
    }
}
