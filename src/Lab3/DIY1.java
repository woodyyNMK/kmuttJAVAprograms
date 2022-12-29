package Lab3;
import java.util.Scanner;
public class DIY1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number, number2;
        //System.out.println("Enter");
        number = sc.nextInt();
        int i;
        int sum = number;
        
        for(i = 1; i < 6; i++){
            number2 = number + i;
            System.out.println(number2);
            if (number2 % 13 == 0){
                number2 = number2 * -1;
                sum = sum + number2;  
            }
            else{
                sum = sum + number2;
            }
        }
        System.out.println(sum);
    }
}
