package Quiz2;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = new String[input.length()/2];
        int count = 0;
        int sum = 0;
        for(int i = 0; i<input.length()-1; i=i+2){
            arr[count] = input.substring(i,i+2);
            sum += Integer.valueOf(arr[count],16);
            count++;
        }
        System.out.println(sum);
    }
}
