package Midterm;
public class test9 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}               
        };

        for(int i = 0; i<4 ;i++){
            if(i%2==0){
                for(int j =0 ; j<4 ; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j =3; j>=0 ;j--){
                    System.out.print(arr[i][j] - 4 + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
