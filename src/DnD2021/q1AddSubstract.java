package DnD2021;
import java.util.Scanner;
public class q1AddSubstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seed = sc.nextInt();
        int result =0;
        for(int i =seed-5;i<=seed+5;i++){
            if(i%3==0)
                result -= i;
            else
                result += i;
        }
        System.out.println(result);
    }
}
