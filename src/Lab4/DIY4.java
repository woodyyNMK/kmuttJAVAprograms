package Lab4;
import java.util.Scanner;
public class DIY4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        String matrix[][] = new String[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                    matrix[i][j] = sc.next();
                }
        }
        //System.out.println(matrix[0][2]);
        
        int input = sc.nextInt();
        String search[] = new String[input];

        for(int j =0; j < input; j++){
            search[j] = sc.next();
        }

        String rowChar="", colChar="";
        
        String tr2bl="", tl2br="";
        String bl2tr="", br2tl="";
        
        String rowArray[] = new String[row*2];
        String colArray[] = new String[col*2];

        String tr2blArray[] = new String[(row+col-1)*2];
        String tl2brArray[] = new String[(row+col-1)*2];
        
        //Store from left to right
        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                rowChar += matrix[i][j];
            }
            rowArray[i] = rowChar;
            rowChar = "";
        }
        
        //Store from right to left
        for(int i = 0; i< row; i++){
            for(int j = col-1; j>= 0; j--){
                rowChar += matrix[i][j];
            }
            rowArray[i+row] = rowChar;
            rowChar = "";
        }
//        for(String a : rowArray)
//          System.out.println(a);

        //Store from Up to down
        for(int j = 0; j< col; j++){
            for(int i = 0; i< row; i++){
                colChar += matrix[i][j];
            }
            colArray[j] = colChar;
            colChar = "";
        }

        //Store from down to up
        for(int j = 0; j< col; j++){
            for(int i = row - 1; i>=0; i--){
                colChar += matrix[i][j];
            }
            colArray[j+col] = colChar;
            colChar = "";
        }
//        for(String a : colArray)
//          System.out.println(a);

        //Storing Diagonal
        int loop = (col-1)*-1;
        int countloop = 0;
        //System.out.println("totol"+loop);
        int num = 0;
        while(countloop < (row+col - 1)){
            //Store topleft to bottom right
            for(int i = 0; i<row; i++){
                for(int j = 0; j < col; j++){
                    if(i - j == loop){
                        //System.out.println(matrix[i][j]);
                        tr2bl += matrix[i][j];
                        //System.out.println(bl2tr); 
                    }
                    if (i + j == countloop){
                        tl2br += matrix[i][j]; 
                        //System.out.println(tl2br); 
                       
                    }
                }
            }
            tr2blArray[num] = tr2bl;
            tl2brArray[num] = tl2br;
            //System.out.println("tr2bl: "+tr2blArray[num]);
            //System.out.println("tl2br: "+tl2brArray[num]);
            num++;
            tr2bl = "";
            tl2br = "";
            loop++;
            countloop++;
        }
        
        int loop1 = (col-1)*-1;
        int countloop1 = 0;
        //System.out.println("totol"+loop);
        int num1 = 0;
        while(countloop1 < (row+col - 1)){
            //Store bottom left to top right
            for(int i = row-1; i>=0; i--){
                for(int j = 0; j <col; j++){
                    if(i - j == loop1){
                        //System.out.println(matrix[i][j]);
                        bl2tr += matrix[i][j];
                        //System.out.println(bl2tr); 
                    }
                }
            }
            for(int i = row-1; i>=0; i--){
                for(int j = col-1; j >=0; j--){
                    if (i + j == countloop1){
                        br2tl += matrix[i][j]; 
                       // System.out.println(br2tl);  
                    }
                }
            }
            tr2blArray[num1 +(row+col - 1)] = bl2tr;
            tl2brArray[num1 +(row+col - 1)] = br2tl;
            //System.out.println("bl2tr: "+bl2trArray[num1]);
            //System.out.println("br2tl: "+br2tlArray[num1]);
            num1++;
            bl2tr = "";
            br2tl = "";
            loop1++;
            countloop1++;
        }

        int include=0;
        for(String keyword: search){
            //boolean kontinue = false;
            for(int i = 0; i< rowArray.length; i++){
                if(keyword.length() > col)
                    break;
                else if(rowArray[i].contains(keyword)){
                    //kontinue = true;
                    System.out.println("Found in row" + rowArray[i]);
                    include++;
                    
                }
            }
            for(int i = 0; i< colArray.length; i++){
                //System.out.println(keyword.length());
                if (keyword.length() > row)
                    break;
                else if(colArray[i].contains(keyword)){
                    //kontinue = true;
                    System.out.println("Found in col" + colArray[i]);                    
                    include++;
                    
                }
            }
            for(int j = 0; j <tr2blArray.length; j++){
                if(tr2blArray[j].contains(keyword) || tl2brArray[j].contains(keyword)){
                    //kontinue = true;
                    System.out.println("Found in diagonal" + j);
                    include++;
                    
                }
            }
            
            if (include >= 1)
                System.out.println(keyword+" found"); 
            else
                System.out.println(keyword+" not found");
            
            include = 0;
        }
        }
    }
