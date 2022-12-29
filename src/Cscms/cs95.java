package Cscms;
import java.util.Scanner;
public class cs95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Average of each row:");
        for(int i=0 ; i<row ; i++){
            int sumRow=0;
            for(int j=0 ; j<col ; j++){
                sumRow += matrix[i][j];
            }   
            double avgRow = (double)sumRow/col;
            System.out.printf("%.2f",avgRow);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Average of each column:");
        for(int i=0 ; i<col ; i++){
            int sumCol=0;
            for(int j=0 ; j<row ; j++){
                sumCol += matrix[j][i];
            }   
            double avgCol = (double)sumCol/row;
            System.out.printf("%.2f",avgCol);
            System.out.print(" ");
        }


    }
}
