package Quiz3;
import java.util.Scanner;
public class q4MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1,row2,col1,col2;
        
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] m1 = new int[row1][col1];
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int[][] m2 = new int[row2][col2];
        if(col1==row2){
            int[][] result = new int[row1][col2];
            for(int i =0; i<row1;i++){
                for(int j = 0;j<col1;j++){
                    m1[i][j] = sc.nextInt();
                }
            }
            for(int i =0; i<row2; i++){
                for(int j = 0; j<col2; j++){
                    m2[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<row1;i++){
                for(int j =0; j<col2; j++){
                    int value = 0;
                    for(int k =0; k<col1; k++){
                        value += m1[i][k]*m2[k][j];
                    }
                    result[i][j]=value;
                }
            }
            for(int a[]:result){
                for(int b:a){
                    System.out.print(b+" ");
                }
            }

        }else
            System.out.println("Invalid");
    }
}
