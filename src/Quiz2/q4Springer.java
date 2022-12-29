package Quiz2;
import java.util.Scanner;
public class q4Springer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for(int i = 0; i<row;i++){
            for(int j = 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int xPos=0,yPos=0;
        for(int i = 1; i<row-1;i++){
            for(int j = 1; j<col-1;j++){  
                if(matrix[i][j]==0){
                    int sum = matrix[i][j-1]+matrix[i][j+1]+
                            matrix[i-1][j-1]+matrix[i-1][j]+matrix[i-1][j+1]+
                            matrix[i+1][j-1]+matrix[i+1][j]+matrix[i+1][j+1];
                    if(sum>max){
                        max = sum;
                        xPos=i;
                        yPos=j;
                    }
                }
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0; j<col;j++){
                if(i == xPos && j == yPos){
                    System.out.print("x ");
                }else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
