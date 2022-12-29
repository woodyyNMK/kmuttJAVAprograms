package Diy2;
import java.util.Scanner;
public class q6DNAcondon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        String rmna = dna.replace("T","U");
        int len = rmna.length()/3;
        String[] arr = new String[len];
        int a = 0;
        for(int i = 0; a<arr.length ; i=i+3){
            arr[a] = rmna.substring(i,i+3);
            a++;
        }
        
        // for(String b : arr)
        //     System.out.println(b);
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("AUG")){
                count++;
                i++;
                boolean valid = true;

                while(valid){
                    if(arr[i].equals("UAG") || arr[i].equals("UAA") || arr[i].equals("UGA") ){
                        valid = false;
                    }else{
                        valid = true;
                        count++;
                        i++;
                        if(i>=arr.length)
                            break;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
