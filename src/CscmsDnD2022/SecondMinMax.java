package CscmsDnD2022;
import java.util.Scanner;
import java.util.Arrays;
public class SecondMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        double[] arr = new double [len];
        for(int i=0 ; i<len ; i++){
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        System.out.printf("%.2f",arr[1]);
        System.out.print(" ");
        System.out.printf("%.2f",arr[len-2]);
    }
}
