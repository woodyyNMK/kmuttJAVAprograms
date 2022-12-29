package Diy1;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if(a.equalsIgnoreCase(b)){
            System.out.println("euqal");
        }else{
            System.out.println("not euqal");
        }
    }
}
