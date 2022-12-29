package Lab6;
public class CircleCaller {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("----c1----");
        System.out.println("Radius: "+c1.getRadius()+"\t Center:  " + c1.getCenter());
        System.out.println("");
        
        Circle c2 = new Circle(5.3);
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("----c2----");
        System.out.println("Radius: "+c2.getRadius()+"\t Center:  " + c2.getCenter());
        System.out.println("");

        Circle c3 = new Circle(1.2, 4, 10);
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("----c3----");
        System.out.println("Radius: "+c3.getRadius()+"\t Center:  " + c3.getCenter());
    }
}
