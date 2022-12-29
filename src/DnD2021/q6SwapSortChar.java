package DnD2021;
import java.util.Scanner;
public class q6SwapSortChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len =sc.nextInt();
        String[] arr=new String[len];
        for(int i = 0; i<len ; i++){
            String st = sc.next();
            arr[i] = st.toLowerCase();
        }
        for(int i=len-1;i>=0;i--){
            if(arr[i].length()>2)
                System.out.print(arr[i].charAt(arr[i].length()-1)+arr[i].substring(1,arr[i].length()-1)+arr[i].charAt(0)+ " ");
            else
                System.out.print(arr[i]+ " ");    
        }
    }
}
