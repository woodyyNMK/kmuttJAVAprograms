package Quiz2;
import java.util.Scanner;
public class q3DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, arr[];
        do{
            // System.out.print("Enter a valid String:");
            input = sc.nextLine();
        }while( ! (0<input.length() && input.length()<=50));
        if(input.length()%7 ==0){
            arr =new String[input.length()/7];
        }else{
            arr =new String[input.length()/7 + 1];
        }
        int track = 0;
        for(int i = 0; i<arr.length;i++){
            String st ="";
            for(int j = 0; j<7;j++){
                if(track<input.length()){
                    st += input.charAt(track);
                    track++;
                }else
                    break;
            }
            arr[i] = st;
        }
        // for(String a:arr){
        //     System.out.println(a);
        // }
        for(int i = 0 ; i<arr.length; i++){
            String st="";
            for(int j = 0; j<arr[i].length();j++){
                if(j<4 && j>0){
                    st += " ";
                }else if(j >= 4){
                    st = st.substring(0,st.length()-1);
                }
                System.out.print(st);
                switch(arr[i].charAt(j)){
                    case 'C':
                        System.out.println("C - - G");break;
                    case 'T':
                        System.out.println("T - - A");break;
                    case 'A':
                        System.out.println("A - - T");break;
                    case 'G':
                        System.out.println("G - - C");break;
                    default:
                        System.out.println("invalid");
                }
            }
        }
    }

}
