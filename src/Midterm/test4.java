package Midterm;
public class test4 {
    public static void main(String[] args) {
        int x = 6;
        switch(x){
            case 5 : for (int i = 0 ;i<x;i++){
                System.out.print("*");
            }
            System.out.print("\n");
            break;

            case 6: for(int i = 0;i<x;i+=2){
                System.out.print("x");
                x++;
            }
            // 0   x   7
            // 2   x   8
            // 4   x   9
            // 6   x   10
            // 8   x   11
            // 10  x   12
            // 12
            System.out.print("\n");

            case 7: for(int i = x; i>0; i -=2 ){
                System.out.print("o");
                i++;
            }
            //12    o   13  11
            //11    o   12  10
            //10
            //9
            //8
            //7
            //6
            //5
            //4
            //3
            //2
            //1
            System.out.print("\n");
            default : break;
        }
    }
}
