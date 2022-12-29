package Quiz3.Q1;

import java.util.*;
public class CuboidTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            Cuboid c = new Cuboid();
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        }
        else{
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            Cuboid c = new Cuboid(x,y,z);
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        }

    }
}
