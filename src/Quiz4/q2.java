package Quiz4;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String mod = input.toUpperCase();
        String arr1[] = input.split(";");
        String arr2[] = mod.split(";");

        for(int i =0;i<arr1.length;i++){
            System.out.print(arr2[i].substring(0,1)+arr1[i].substring(1)+" ");
        }
    }
}