package Diy5;
import java.util.Scanner;

public class q4Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int len = 2*input -1 ;
        char[][] matrix = new char[len][len];

        for(int i = 0; i<len;i++){
            for(int j = 0; j<len; j++){
                if(i==0 && j>=input-1 || i==input-1 && j <=input-1 || i==len-1 && j<=input-1){
                    matrix[i][j]='*';
                }else if((j==0 && i>=input-1)||(j==input-1 && i>=input-1)||(j==len-1 && i<=input-1)){
                    matrix[i][j]='*';
                }else if(i+j==input-1 || i+j==3*(input-1) || (i+j == 2*(input-1) && i<=input-1)){
                    matrix[i][j]='*';
                }else{
                    matrix[i][j]=' ';
                }
            }
        }
        for(char[] a:matrix){
            for(char b:a){
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}
