package Lab3;
import java.util.Scanner;
public class DIY6Protein {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    String dna = sc.nextLine();
    String newCh = dna.replace("T", "U");
    System.out.println(newCh);
    
    int track=0;
    int i;
    int len = newCh.length();
    
    String[] arr = new String[len/3];
    
    for(i = 0; i< len; i=i+3){
        arr[i/3] = newCh.substring(track, i+3);
        track += 3;
        System.out.println(arr[i/3]);
    }
    int a;
    boolean kontinue = true;
    int count = 0;
    
    for(a = 0; a < arr.length; a++){ 
        if (arr[a].equals("AUG")){
            
            System.out.println("START " + arr[a]);
            count++;
            a++;
            System.out.println("start "+ count);
        
            kontinue = true;
            while(kontinue){
                if (arr[a].equals("UAG") || arr[a].equals("UAA") || arr[a].equals("UGA")){
                    kontinue = false;
                    System.out.println("STOP "+ arr[a]);
                    break;
                }
                else{
                    System.out.println(arr[a]);
                    kontinue = true;
                    count++;
                    
                    if (a == arr.length-1)
                        kontinue = false; 
                    a++;
                    System.out.println(count);
                    }
            }
        }  
    }
    System.out.println("Count "+ count);
    }
}
