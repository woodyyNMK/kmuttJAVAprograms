package CodeChef;
import java.util.Scanner;
public class q6MaxMinusMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        // int[] arr = new int[3];
        while(loop-- >0){
            int max = 0, min = 100;
            for(int i =0; i<3 ;i++){
                int x = sc.nextInt();
                if(x>max)
                    max=x;
                if(x<min)
                    min=x;
            }
            System.out.println(max-min);
        }
    }
}
