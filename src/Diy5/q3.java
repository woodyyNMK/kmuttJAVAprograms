package Diy5;
import java.util.Scanner;
import java.util.Arrays;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[len-1]+" "+arr[0]);
    }
}
