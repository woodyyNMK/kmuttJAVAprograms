package Cscms;
import java.util.Scanner;
import java.util.Arrays;
public class cs49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String st = input.toLowerCase();
        if(st.contains("-")){
            st.replace("-"," ");
        }
      	int len;
        if(st.contains(" ")){
            String word[]=st.split(" ");
            String newst="";
            for(int i =0; i<word.length;i++){
                newst += word[i];
            }
            len = newst.length();
        }else{
            len = st.length();
        }
        int[] arr = new int[len];
        for(int i = 0;i<arr.length;i++){
            arr[i]= st.charAt(i);
        }
        Arrays.sort(arr);
        int track = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[track] == arr[i]){
                System.out.println(input + " is not an isogram");
                break;
            }
            track++;
        }
        if(track == len-1)
            System.out.println(input + " is an isogram");
    }
}
