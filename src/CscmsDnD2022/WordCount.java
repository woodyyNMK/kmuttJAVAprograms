package CscmsDnD2022;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        for(int x=0 ; x<=sentence.length()-word.length() ; x++){           
                if(word.equalsIgnoreCase(sentence.substring(x,x+word.length()))){
                    x += word.length()-1;
                    count++;
                }
        }
        System.out.println(count);
    }
}