package Diy5;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch(input){
            case "Monday":
                System.out.println("Fortune : Purple\nUnfortunate : Red"); break;
            case "Tuesday":
                System.out.println("Fortune : Orange\nUnfortunate : Yellow, White"); break;
            case "Wednesday":
                System.out.println("Fortune : Black, Brown, Gray\nUnfortunate : Pink"); break;
            case "Thursday":
                System.out.println("Fortune : Red\nUnfortunate : Purple"); break;
            case "Friday":
                System.out.println("Fortune : Pink\nUnfortunate : Black, Blue, Gray"); break;
            case "Saturday":
                System.out.println("Fortune : Blue, Baby Blue\nUnfortunate : Green"); break;
            case "Sunday":
                System.out.println("Fortune : Green\nUnfortunate : Blue, Baby Blue"); break;
            default:
                System.out.println("Invalid Date");
        }
    }
}
