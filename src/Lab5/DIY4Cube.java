package Lab5;
import java.util.Scanner;

public class DIY4Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int row = num*2 - 1;
        char[][]matrix = new char[row][row];

        for(int i = 0; i<num*2-1; i++){
            for(int j = 0; j<num*2-1; j++){
                //For Left to Right
                if(
                    (j >= num-1 && i == 0) ||
                    (i == num-1 && i>=j) || 
                    (i == 2*(num-1) && j<=num-1)
                    ){
                    matrix[i][j] = '*';
                }
                //For Diagonal
                else if(
                    (i+j == num-1) || 
                    (i+j == 2*(num-1) && j>=i) || 
                    (i+j == 3*(num-1))
                    )
                    matrix[i][j] = '*';
               
                //For Top to bottom
                else if (
                        (i >= num-1 && (j == 0 || j == (num-1))) || 
                        (j == 2*(num-1) && i <= num-1)
                        )
                    matrix[i][j] = '*';

                else
                    matrix[i][j] = '-';
            }
        }
        for(char[]a: matrix){
            for(char b: a){
                System.out.print(b);
            }
            System.out.println();
        }

    }
}
