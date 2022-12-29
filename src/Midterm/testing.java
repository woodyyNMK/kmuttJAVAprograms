package Midterm;
public class testing {
    public static void main(String[] args) {
        int i = 0, y = 0;

        while(i<100){
            i++;
        }
        y += i;
        System.out.println(y);

        int[][] x = new int [2][3];
        System.out.println(x.length);
        System.out.println(x[1].length);

        int z = 1;
        int sum = 0;
        

        do{
            z++;
            System.out.println(z);
        }while(z<=50);
    }
}
