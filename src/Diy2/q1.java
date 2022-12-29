package Diy2;

import java.util.Scanner;
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = input;
        for(int a = input+1; a<=input+5;a++){
            if(a%13 == 0){
                result -= a;
            }else{
                result += a;
            }
        }
        System.out.println(result);
    }
}