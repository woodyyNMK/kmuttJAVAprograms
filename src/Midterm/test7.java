package Midterm;
public class test7 {
    public static void main(String[] args) {
        int j = 1;
        int k = 1;
        int n = 4;
        int arr[] = new int[n*(n+1)/2];
        for(int i = 0; i<n*(n+1)/2 ; i++){
            arr[i] = j++;
            if(j>k){
                j = 1;
                k++;
            }
            
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
//0 1 - 2
//if 1 k2
//1 1 - 2
//2 2 - 3
//if 1 k3
//3 1 - 2
//4 2 - 3
//5 3 - 4
//if 1 k4
// 6 - 1
// 7 - 2
// 8 - 3
// 9 - 4
