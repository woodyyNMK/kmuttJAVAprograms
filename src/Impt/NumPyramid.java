package Impt;
public class NumPyramid {
    public static void main(String[] args) {
        int num = 9;
        for(int i = 1; i <=num ; i++){
            for(int space = i ; space<num ;space++){
                System.out.print(" ");
            }for(int j = i ; j>=1 ; j--){
                System.out.print(j);
            }for(int k = 2; k<=i;k++){
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}