package Diy2;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split("[.]");
        int i;
        for(i = 0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            if(a<0 && a>255){
                break;
            }
        }
        if(i==arr.length)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
