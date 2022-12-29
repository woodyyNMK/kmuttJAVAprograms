package DnD2021;
import java.util.Scanner;
public class q7seedAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int result=0;
        for(int i =seed;i<=seed+20;i=i+2){
            result +=i;
        }
        System.out.println(result);
    }
}
