package DnD2021;
import java.util.Scanner;
public class q4twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc. nextInt();
        int[][] matrix= new int[row1][col1];
        int row2 =sc.nextInt();
        for(int i=0; i<row1 ; i++){
            for(int j=0 ; j<col1 ; j++){
                matrix[i][j]=0;
            }
        }
        for(int i=0 ; i<row2 ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            matrix[x][y]+=1;
            if(y>0)
                matrix[x][y-1]+=1;
            if(y<col1-1)
                matrix[x][y+1]+=1;
            if(x<row1-1)
                matrix[x+1][y]+=1;
            if(x>0)
                matrix[x-1][y]+=1;
        }
        for(int i=0; i<row1 ; i++){
            for(int j=0 ; j<col1 ; j++){
                if(matrix[i][j]>3){
                    matrix[i][j]=1;
                }
            }
        }
        for(int[] a: matrix){
            for(int b:a){
                System.out.print(b +" ");
            }
            System.out.print("\n");
        }
        
    }
}