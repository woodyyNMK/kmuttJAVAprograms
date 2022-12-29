package Quiz1;
import java.util.Scanner;
public class q4Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 1;
        for(int i =2;result<input;i++){
            result *= i;
        }
        if(result==input){
            System.out.println("This number is a result of factorial");
        }else if(result>input){
            System.out.println("This number is not a result of factorial120");
        }
    }
}
