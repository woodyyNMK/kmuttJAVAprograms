package Midterm;
public class test5 {
    public static void main(String[] args) {
        int x = 3, y = 3, r =0;
        while(true){
            if(x == 0 && y!=0){
                x = y;
                y -= 1;
            }else if(x != 0 && y !=0){
                x -= 1;
            }else{
                break;
            }
            r +=x;
            System.out.println(r);
        }
        System.out.println(r);
    }
}
// 2 1 0 3 2 1 0 2 1 0 1 0