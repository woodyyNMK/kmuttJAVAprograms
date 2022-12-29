package Midterm;
public class test8 {
    public static void main(String[] args) {
        char[] secret ={'j', 'p', 'r', 'w', 'i', 'z', 'p', 'y'};
        int[] password = {1,4,3};
        for(int i=0 ; i<8; i++){
            secret[i] -= (i == 5 ) ?  password[0] :password[i%3];
        }
        //abcdefghijklmnopqrstuvwxyz
        //j-1 p-4 r-3 w-1 i-4 z-1 p-1 y-1
        //iloveyou
        System.out.println(secret);
    }
}
