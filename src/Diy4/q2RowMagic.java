package Diy4;
import java.util.Scanner;
public class q2RowMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int result[] = new int[row];

        for(int i = 0; i<row; i++){
            int sum = 0;
            for(int j = 0; j<col; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            result[i] = sum;
        }

        boolean valid = true;
        for(int i = 0; i<row-1;i++){
            if(result[i] != result[i+1]){
                valid = false;
                break;
            }else
                valid = true;
        }
        if(valid == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
