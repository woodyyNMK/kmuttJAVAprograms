package Lab7;
public class Circle extends GeometricObject {
    private double radius;
    private final double PI = Math.PI;
    
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this(radius, "white", true);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("It is a circle with radius of "+ radius);
    }
    
}
