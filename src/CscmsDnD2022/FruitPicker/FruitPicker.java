package CscmsDnD2022.FruitPicker;
import java.util.Scanner;
public class FruitPicker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int day = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int decrease=0;
        int sum=0;
        for(int loop=0 ; loop<day ;loop++){
            int max = 0;
            int tracki =0;
            int trackj =0;
            for(int i=0 ; i<row ; i++){
                for(int j=0 ; j<col ;j++){
                    if(matrix[i][j]>0){
                        matrix[i][j] -= decrease;
                    }
                    if(matrix[i][j]>max){
                        max = matrix[i][j];
                        tracki=i;
                        trackj=j;
                    }
                }
            }
            matrix[tracki][trackj]=0;
            sum +=max;
            decrease = 1;
            for(int a[]:matrix){
                for(int b:a){
                    System.out.print(b+" ");
                }
                System.out.println();
                System.out.println();
            }
        }
        System.out.println(sum);
    }
}
