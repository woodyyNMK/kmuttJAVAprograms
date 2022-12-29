package Diy4;
import java.util.Scanner;
public class q3Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hourValue ={6,1,2,3,4,5,6};
        int[] minValue1 ={1,2,3,4,5,6,7,8,9};
        int[] minValue2 ={10,20,30};

        int a[] = new int[7];
        int b[] = new int[9];
        int c[] = new int[3];

        int totalHour =0;
        for(int i = 0; i<7; i++){
            a[i] = sc.nextInt();
        }
        if(a[1] == 1)
            totalHour += hourValue[0];
        for(int i =1;i<7;i++){
            if(a[i] == 0){
                totalHour += hourValue[i-1];
                break;
            }
        }
        // System.out.println(totalHour);

        int totalMin=0;
        int totalMin1=0;
        int totalMin2=0;
        for(int i =0;i<9;i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<9; i++){
            if(b[i] == 0){
                totalMin1 += minValue1[i-1];
                break;
            }
        }
        // System.out.println(totalMin1);

        for(int i = 0;i<3;i++){
            c[i]=sc.nextInt();
            if(c[i] == 1)
                totalMin2 += minValue2[i];
        }
        totalMin = totalMin1+totalMin2;
        System.out.println(totalHour + ":"+totalMin);
    }
}
