package Cscms;
import java.util.Scanner;
import java.util.Arrays;
public class cs94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        double[] arr = new double[len];
        for(int i=0 ; i<len ; i++){
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        for(int i=0 ; i<len/2 ; i=i+2){
            double temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i]=temp;
        }
        for(double a : arr){
            System.out.printf("%.2f",a);
            System.out.print(" ");
        }
    }
}
