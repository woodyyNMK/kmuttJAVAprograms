package Cscms;
import java.util.Scanner;
public class cs93 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len =sc.nextInt();
        String[] arr = new String[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.next();
            String w ="";
            for(int j = arr[i].length()-1;j>=0;j--){
                if(j == arr[i].length()-1)
                    w +=(arr[i].charAt(j)+"").toUpperCase();
                else
                    w +=(arr[i].charAt(j)+"").toLowerCase();
            }
            System.out.print(w+ " ");
        }
    }
}
