package Cscms;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String res[] = {"rock","paper","scissors"};
    String st1 = sc.nextLine();
    String st2 = sc.nextLine();
    int i1= 0;
    int i2=0;
    for(int j=0 ; j<3 ;j++){
        if(st1.equalsIgnoreCase(res[j]))
        i1=j;
    }
    for(int k=0 ; k<3 ;k++){
        if(st2.equalsIgnoreCase(res[k]))
        i2=k;
    }
    if(i1 == i2){
        System.out.println("Draw");
    }else{
        if(i1 == 0 && i2 == 1)
            System.out.println("Dr.Worarat Krathu");
        else if(i1 == 0 && i2 == 2 )
            System.out.println("Mr.Ukrit Ruckcharti");
        else if(i1 == 1 && i2 == 0)
            System.out.println("Mr.Ukrit Ruckcharti");
        else if(i1 == 1 && i2 == 2)
            System.out.println("Dr.Worarat Krathu");
        else if(i1 == 2 && i2 == 0)
            System.out.println("Dr.Worarat Krathu");
        else if(i1 == 2 && i2 == 1)
            System.out.println("Mr.Ukrit Ruckcharti");
    }
  }
}
