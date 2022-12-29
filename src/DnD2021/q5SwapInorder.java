package DnD2021;
import java.util.Scanner;
public class q5SwapInorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len ; i++){
            arr[i]= sc.nextInt();
        }

        int count = sc.nextInt();
        for(int i=0 ; i<count ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int temp=0;
            temp = arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
