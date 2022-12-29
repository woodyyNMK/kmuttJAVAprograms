package Cscms;
import java.util.Scanner;
import java.util.Arrays;
public class cs90subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len ;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<len ; i++){
            for(int j=0; j<len-count ;j++){
                for(int k=0; k<len-count ;k++){

                }
            }
            count++;
        }
        
    }
}



// Arrays.sort(arr);
//         int loop = sc.nextInt();
//         for(int i =0;i<loop;i++){
//             int input =sc.nextInt();
//             int original = input;
//             int sum =0;
//             for(int j =len-1; j>=0; j--){
//                 if(arr[j]<=input){
//                     sum += arr[j];
//                     input -= arr[j];
//                 }
//             }
//             if(input == 0)
//                 System.out.println("Yes");
//             else
//                 System.out.println("No");
//         }
// }
