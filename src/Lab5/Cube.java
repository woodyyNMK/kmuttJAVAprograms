package Lab5;
import java.util.Scanner;

public class Cube {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        int len = 2*input -1;
        char matrix[][] = new char[len][len];

        for(int i = 0 ; i<2*len-1 ; i++){
            for(int j = 0 ; j<2*len-1 ; j++){
                // L2R
                if(
                    (i == 0 && j>=input-1)||
                    (i==input-1 && j<= i)||
                    (i==2*(input-1) && j<=input-1)
                    ){
                    matrix[i][j] = '*';
                }
                // T2B
                else if(
                    (i >= input-1 && j == 0)||
                    (i >=input-1 && j == input-1)||
                    (j==2*(input-1)&&i<=input-1)
                    ){
                    matrix[i][j] = '*';
                }
                // diagonal
                else if(
                    (i+j == input-1)||
                    i+j == 3*(input-1)||
                    (i+j ==2*(input-1)&& j>=i)){
                    matrix[i][j] ='*';
                }
                else
                    matrix[i][j] ='-';
            }
        }

                for(char[] a : matrix ){
                    for(char b : a){
                        System.out.print(b);
                    }
                    System.out.print("\n");
                }
         
    }
}
