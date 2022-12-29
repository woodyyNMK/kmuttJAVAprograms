package Quiz1;
import java.util.Scanner;
public class q2Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=1; i<=input;i++){
            for(int space = input-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}