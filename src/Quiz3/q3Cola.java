package Quiz3;
import java.util.Scanner;
public class q3Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstP = sc.next();
        String secondP="";
        if(firstP.equals("A"))
            secondP += "B";
        else
            secondP += "A";
        int num = sc.nextInt();
        int arr[]=new int[num];
        for(int i = 0;i<num ;i++){
            arr[i]=i+1;
        }
        int size =0,count=0;
        String st1 =""; String st2 = "";
        for(int i= 0; i<arr.length;i=i+2*(size)){
            for(int j = 0; j<1+size;j ++){
                if(count<arr.length){
                    st1 += arr[count] + " ";
                    count++;
                }
            }
            for(int k = 0; k<1+size;k++){
                if(count<arr.length){
                    st2 += arr[count] + " ";
                    count++;
                }
            }
            size++;
        }
        String search = num+"";
        if(st1.contains(search)){
            System.out.println(firstP);
        }else if(st2.contains(search)){
            System.out.println(secondP);
        }
    }
}
