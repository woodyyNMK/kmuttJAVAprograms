package DnD2021;
import java.util.Scanner;
import java.util.Arrays;
public class q2SortChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] arr= new String[len];
        for(int i=0;i<len;i++){
            String st=sc.next();
            arr[i]=st.toUpperCase();
            int[] arr1 = new int[arr[i].length()];
            for(int j=0;j<arr1.length;j++){
                arr1[j]=arr[i].charAt(j);
            }
            Arrays.sort(arr1);
            for(int a : arr1){
                char c = (char)a;
                System.out.print(c);
            }
            System.out.print(" ");
        }
    }
}