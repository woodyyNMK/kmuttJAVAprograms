package Quiz1;
import java.util.Scanner;
public class q3ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        String[] arr=new String[len];
        String result="";
        for(int i = 0; i<len; i++){
            arr[i]= sc.next();

            int sum=0;
            for(int j=0; j<arr[i].length(); j++){
                sum += arr[i].charAt(j);
            }
            int number = sum%90;
            char character = (char)number;
            result+= character;
        }
        System.out.println(result);
    }
}
