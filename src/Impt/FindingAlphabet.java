package Impt;
import java.util.Scanner;
public class FindingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        String st = y.toLowerCase();
        String result = "";
        String x ="";

        for(int i = 0; i<st.length() ; i++){
            x += st.charAt(i);
            if(result.length()>0){
                if(result.contains(x) == false){
                        result += st.charAt(i);
                }
            }else{
                result += st.charAt(i);
            }
            x = "";
        }
        String upperResult = result.toUpperCase();
        char arr[] = new char[upperResult.length()];
        for(int i = 0; i<upperResult.length();i++ ){
                // System.out.print(upperResult.charAt(i)+ " ");
            arr[i] = upperResult.charAt(i);
        }
        for(int i = 0; i<upperResult.length();i++ ){
            for(int j = 0 ; j<arr.length-1 ; j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(char a : arr){
            System.out.print(a + " ");
        }
    }
}
// absdasdeqeuqweiwqeq
// Acollectionthatcontainsnoduplicateelements
