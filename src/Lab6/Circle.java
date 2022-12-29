package Lab6;
public class Circle {
    private double radius;
    private double xcoor;
    private double ycoor;
    private final double PI = Math.PI;
    public static int circleCounter;
    
    public Circle(){
        circleCounter++;
    }
    public Circle(double radius){
        this.radius = radius;
        circleCounter++;
    }
    public Circle(double r, double x, double y){
        radius = r;
        xcoor = x;
        ycoor = y;
        circleCounter++;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    public void setCenter(double x, double y){
        xcoor = x;
        ycoor = y;
    }
    public String getCenter(){
        return xcoor + ","+ycoor;
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
    public double getDiameter(){
        return 2*radius;
    }
    public double getAreaofCircle(int n){
        return n*getArea();
    }
    public void printInfo(){
        System.out.println("The circle have:");
        System.out.println("radius = "+radius);
        System.out.println("area = "+ getArea());
        System.out.println("diameter ="+ getDiameter());
        System.out.println("coordinate = ("+xcoor+","+ycoor+")");
    }
    
}
