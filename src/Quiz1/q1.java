package Quiz1;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C =100;
        final int D =500;
        final int M =1000;
        int result = 0;
        for(int i=0;i<input.length();i++){
            switch(input.charAt(i)){
                case 'I':
                if(i+1<input.length()){    
                    if(input.charAt(i+1)=='V' || input.charAt(i+1)=='X')
                        result -= I;
                    else
                        result += I;
                }else
                    result += I;
                break;
                case 'X':
                if(i+1<input.length()){    
                    if(input.charAt(i+1)=='L' || input.charAt(i+1)=='C')
                        result -= X;
                    else
                        result += X;
                }else
                    result += X;
                break;
                case 'C':
                if(i+1<input.length()){    
                    if(input.charAt(i+1)=='D' || input.charAt(i+1)=='M')
                        result -= C;
                    else
                        result += C;
                }else
                    result += C;
                break;
                case 'V':
                    result += V;break;
                case 'L':
                    result += L;break;
                case 'D':
                    result += D;break;
                case 'M':
                    result += M;break;
            }
        }
        System.out.println(result);
    }
}
