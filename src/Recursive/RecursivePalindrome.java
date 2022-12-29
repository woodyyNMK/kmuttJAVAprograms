package Recursive;
import java.util.Scanner;
public class RecursivePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(Palindrome(input)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    public static boolean Palindrome(String i){
        if(i.length()==0 || i.length()==1)
            return true;
        else if(! (i.charAt(0)==(i.charAt(i.length()-1))))
            return false;
        else 
         return Palindrome(i.substring(1,i.length()-1));
    }
}
