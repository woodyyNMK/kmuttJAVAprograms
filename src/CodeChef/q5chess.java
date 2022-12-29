package CodeChef;
import java.util.Scanner;
public class q5chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int timeLimit = 20;
        while(loop-- >0){
            int input = sc.nextInt();
            int freeMins = input*60;
            System.out.println(freeMins/timeLimit);
        }
    }
}
