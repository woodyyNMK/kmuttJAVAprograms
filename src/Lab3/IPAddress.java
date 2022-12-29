package Lab3;
import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args){
        String address;
        int address1;
        int i=0, track;
        boolean kontinue=true;
        track = 0;
        
        Scanner sc = new Scanner(System.in);
        address = sc.nextLine();
        //System.out.println(address.length()-1);
        
        while(kontinue == true && i < address.length()){
            
            if (address.charAt(i)== '.'){
//                if(i == track+1)
//                    address1 = Integer.parseInt(Character.toString((address.charAt(track))));
//                
//                else
                    address1 = Integer.parseInt(address.substring(track, i));
                //System.out.println(address1);
                
                //System.out.println(i);
                //System.out.println(track);
                if (address1 >= 0 && address1 <= 255){
                    kontinue = true;  
                    track = i+1;
                    i++;
                    //System.out.println("Inner"+ i);
                    //System.out.println("Valid");
                }
                else{
                    kontinue = false;
                    //System.out.println("Invalid");
                }
            }
            else if (i == address.length()-1){
                //System.out.println("HERE");
                System.out.println("HERE");
                address1 = Integer.parseInt(address.substring(track));
                //System.out.println(address1);
                if (address1 >= 0 && address1 <= 255){
                    kontinue = true;
                    //System.out.println("Valid");
                    break;
                }
                else{
                    kontinue = false;
                    //System.out.println("Invalid");
                }
            }
            else
                i++;
                //System.out.println("Outer"+ i);
        }
        if (kontinue == true)
                System.out.println("Valid");
        else
            System.out.println("Invalid");
        }
}

