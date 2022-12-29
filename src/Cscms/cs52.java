package Cscms;
import java.util.Scanner;
public class cs52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.length()%2 == 0){
            String w="";
            for(int i=input.length()/2-1;i>=0;i--){
                w += input.charAt(i);
            }
            for(int j=input.length()-1;j>=input.length()/2;j--){
                w += input.charAt(j);
            }
            System.out.println(w);
        }else{
            int len = input.length()-1;
            int pos = len/2;
            String w="";
            for(int i=pos-1;i>=0;i--){
                w+= input.charAt(i);
            }
            w+=input.charAt(pos);
            for(int i=input.length()-1;i>pos;i--){
                w+=input.charAt(i);
            }
            System.out.println(w);
        }
    }
}
