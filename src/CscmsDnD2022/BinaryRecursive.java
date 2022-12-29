package CscmsDnD2022;
import java.util.Scanner;
public class BinaryRecursive{
	public static String binary(int a){
    	if(a<2){
          return a+"";
        }else{
        	return binary(a/2)+a%2;
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String ans = binary(a);
		System.out.println(ans);
	}
}