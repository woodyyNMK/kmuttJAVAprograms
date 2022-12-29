package Quiz2;
import java.util.Scanner;
import java.util.Arrays;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        int[] arr = new int[input];

        for(int i=0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        String oneD ="";
        String twoD ="";
        String threeD ="";
        String fourD ="";
        for(int i=0; i<input;i++){
            if(arr[i]<10){
                oneD += arr[i] + " ";
            }else if(10<=arr[i] && arr[i]<100){
                twoD += arr[i]+ " ";
            }else if(100<=arr[i] && arr[i]<1000){
                threeD += arr[i]+ " ";
            }else if(1000<=arr[i] && arr[i]<10000){
                fourD += arr[i]+ " ";
            }
        }
        if(oneD.length()==0){
            oneD += 0;
        }
        if(twoD.length()==0){
            twoD += 0;
        }
        if(threeD.length()==0){
            threeD += 0;
        }
        if(fourD.length()==0){
            fourD += 0;
        }
        System.out.println(oneD);
        System.out.println(twoD);
        System.out.println(threeD);
        System.out.println(fourD);
    }
}
