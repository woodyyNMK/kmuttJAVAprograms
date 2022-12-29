
package Lab2;
import java.util.Scanner;
public class dayOfWeek {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number between 1 to 7: ");
        int day = sc.nextInt();
        
        System.out.println("WITH IF....ELSE");
        if (day == 1)
            System.out.println("It's MONDAY");                
        else if (day == 2)
            System.out.println("It's TUESDAY"); 
        else if (day == 3)
            System.out.println("It's WEDNESDAY"); 
        else if (day == 4)
            System.out.println("It's THURSDAY"); 
        else if (day == 5)
            System.out.println("It's FRIDAY"); 
        else if (day == 6)
            System.out.println("It's SATURDAY"); 
        else 
            System.out.println("It's SUNDAY"); 

        System.out.println("WITH SWITCH");
        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("SUNDAY");
                break;
        }
            
    }
        
}
