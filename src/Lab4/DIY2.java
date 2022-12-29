package Lab4;
import java.util.Scanner;
public class DIY2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        int row, col;
        int total = 0;
        int totalSum = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        int matrix[][] = new int[a][b];
        int sum[] = new int[a];
        
        
        for(int i = 0; i< a; i++){
            for(int j = 0; j< b; j++){
                col = sc.nextInt();
                matrix[i][j] = col;
                }
                
                for(int num: matrix[i]){
                    total += num;
                    sum[i] = total;
                }
                total = 0;
                //System.out.println(total);
                //System.out.println(sum[i]);
        }
        
        boolean kontinue = true;
        for(int num = 0; num<sum.length-1; num++){
            if (sum[num] == sum[num+1])
                    kontinue =true;
            else{
                kontinue = false;
                break;
            }
        }
        
        if (kontinue == true)
            System.out.println("true");
        else
            System.out.println("false");
        
        //System.out.println(matrix[0][3]);
        //System.out.println(matrix[1][2]);
        
    }
}