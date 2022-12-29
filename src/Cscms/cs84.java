package Cscms;
import java.util.Scanner;
import java.util.Arrays;
public class cs84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String[] stArr = new String[x];
        for(int i = 0; i<x ;i++){
            stArr[i] = sc.nextLine();
            String[] countArr = stArr[i].split(" ");
            int len = countArr[0].length();
            int[] intArr1 = new int[len];
            int[] intArr2 = new int[len];
            for(int k =0;k<len;k++){
                intArr1[k] = countArr[0].charAt(k);
            }
            Arrays.sort(intArr1);
            for(int k =0;k<len;k++){
                intArr2[k] = countArr[1].charAt(k);
            }
            Arrays.sort(intArr2);
            int count=0;
            for(int j = 0; j<len ; j++){
                if(intArr1[j] == intArr2[j]){
                    count++;
                }else
                    break;
            }
            if(count == len)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
