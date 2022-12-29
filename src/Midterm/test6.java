package Midterm;
public class test6 {
    public static void main(String[] args) {
        int i = 0;
        int x = 62;
        do{
            i++;
            x /= 2;
        }while(x%2 != 0);
        System.out.println(i);
    }
    // 1 31
    // 2 15
    // 3 7
    // 4 3
    // 5 1
    // 6 0
}
