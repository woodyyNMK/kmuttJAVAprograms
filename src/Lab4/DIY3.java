package Lab4;
import java.util.Scanner;
public class DIY3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int hour, bMin, sMin;
        int tHour= 0, tbMin= 0, tsMin= 0;
        int[] arrHour = new int[7];
        int[] arrbMin = new int[9];
        int[] arrsMin = new int[3];
        int[] Hvalue = {6, 1, 2, 3, 4, 5, 6};
        int[] bMinvalue = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        int[] sMinvalue = {10, 20, 30};
        
        for(int i = 0; i<7; i++){
            hour = sc.nextInt();
            arrHour[i] = hour;
        }
        for(int j = 0; j<9; j++){
            bMin = sc.nextInt();
            arrbMin[j] = bMin;
        }
        for(int k = 0; k<3; k++){
            sMin = sc.nextInt();
            arrsMin[k] = sMin;
        }
        if (arrHour[0] == 1)
            tHour += 6;
        for(int a=0; a<7; a++){
            if(arrHour[Hvalue.length-1] == 1){
                tHour += 6;
                break;
            }
            else if(arrHour[a] == 1 && arrHour[a+1] == 0)
                tHour += Hvalue[a] * arrHour[a];
        }
        for(int b=0; b<9; b++){
            if(arrbMin[b] == 1 && arrbMin[b+1] == 0 || arrbMin[8] == 1) 
            tbMin += bMinvalue[b] * arrbMin[b];
        }
        for(int c=0; c<3; c++){
            tsMin += sMinvalue[c] * arrsMin[c];
        }
        if (tsMin > 60){
            tsMin -= 60;
            tHour += 1;
        }
        System.out.println(tHour+":"+(tbMin+tsMin));
        
    }
}
