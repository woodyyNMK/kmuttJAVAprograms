package Quiz3;
import java.util.Scanner;
public class q2GlucoseToleranceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int limit[] = {95,180,155,140};
        int count=0;
        for(int i =0; i<4; i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=limit[i]){
                count++;
            }
        }
        if(count>=3)
            System.out.println("Negative");
        else
            System.out.println("Potential DM");
    }
}
