package Midterm;
import java.util.Scanner;
public class test3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i =0 ; i<x ;i++){
            for(int j = 0 ; j <x*2 +1 ;j++){
                if((i+j)%2 ==0){
                    System.out.print("o");
                }else{
                    System.out.print("x");
                }
            }
            System.out.print("\n");
        }
    }
}