package Diy4;
import java.util.Scanner;
public class q4WordSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String[][] matrix = new String [row][col];

        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                matrix[i][j] = sc.next();
            }
        }

        int x = sc.nextInt();
        sc.nextLine();
        String[] searchWords = new String[x];
        for(int i =0; i<x;i++){
            searchWords[i] = sc.next();
        }

        String[]rowWords = new String[2*row];
        String l2r="";
        String r2l="";
        int count = 0;
        for(int i = 0; i<2*row-1;i=i+2){
            for(int j = 0; j<col; j++){
                l2r += matrix[count][j];
                r2l += matrix[count][col-1-j];
            }
            count++;
            rowWords[i]= l2r;
            l2r="";
            rowWords[i+1]= r2l;
            r2l="";
        }
        
        count = 0;
        String[]colWords = new String[2*col];
        String t2b="";
        String b2t="";
        for(int j = 0; j<col*2-1;j=j+2){
            for(int i = 0; i<row;i++){
                t2b += matrix[i][count];
                b2t += matrix[row-1-i][count];
            }
            count++;
            colWords[j]=t2b;
            t2b="";
            colWords[j+1]=b2t;
            b2t="";   
        }
        
        count=0;
        int loop1 = 0;
        int loop2 = col-1;
        String tl2br ="";
        String tr2bl ="";
        String tl2br2 ="";
        String tr2bl2 ="";
        String[] diaWords=new String[4*((col+row)-1)];
        for(int k = 0; k<diaWords.length;k=k+4){
            for(int i = 0;i<row;i++){
                for(int j =0;j<col;j++){
                    if(i+j==loop1){
                        tr2bl += matrix[i][j];
                    }
                    if(i-j==loop2){
                        tl2br += matrix[i][j];
                    }
                }
            }
            for(int i = row-1;i>=0;i--){
                for(int j =0;j<col;j++){
                    if(i+j==loop1){
                        tr2bl2 += matrix[i][j];
                    }
                    if(i-j==loop2){
                        tl2br2 += matrix[i][j];
                    }
                }
            }
            loop1++;
            loop2--;
            diaWords[k]=tr2bl;
            tr2bl="";
            diaWords[k+1]=tr2bl2;
            tr2bl2="";
            diaWords[k+2]=tl2br;
            tl2br="";
            diaWords[k+3]=tl2br2;
            tl2br2="";
        }
        // for(String a: diaWords){
        //     System.out.println(a);
        // }
        
        for(String keyword : searchWords){
            int include =0;
            for(int i=0;i<rowWords.length; i++){
                if(rowWords[i].contains(keyword))
                    include++;
            }
            for(int i=0;i<colWords.length; i++){
                if(colWords[i].contains(keyword))
                    include++;
            }
            for(int i=0;i<diaWords.length; i++){
                if(diaWords[i].contains(keyword))
                    include++;
            }
            if(include>0){
                System.out.println(keyword+" found");
            }else{
                System.out.println(keyword+ " not found");
            }
        }
    }
}
