package DnD2021;
import java.util.Scanner;
public class q3AdjacentSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len ; i++)
            arr[i] = sc.nextInt();
        if(len%2==0){
            for(int i=0; i<len ; i=i+2){
                int temp = 0;
                for(int k=0; k<1 ; k++){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }else{
            for(int i=0; i<len-1 ; i=i+2){
                int temp = 0;
                for(int k=0; k<1 ; k++){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int a: arr)
            System.out.print(a+ " ");
    }
}
