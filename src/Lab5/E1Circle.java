package Lab5;
public class E1Circle {
    double radius;
    final double PI = 3.14159;
    double xcoor;
    double ycoor;
    public static int countCircleObject;
    
    public void setRadius(double r){
        radius = r;
        countCircleObject++;
    }
    
    public static int getNumberofCircleObject(){
        return countCircleObject;
    }
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        double area = PI * radius * radius;
        return area;
    }
    
    public double getPerimeter(){
        return 2*PI*radius;
    }
    
    public double getAreaofCircles(int n){
        //return n * PI * radius * radius;
        return n * getArea();
    }
    
    public double getDiameter(){
        return 2*radius;
    }

    public void setCenter(int x, int y){
        xcoor = x;
        ycoor = y;
    }
    
    public void printInfo(){
        System.out.println("The circle have:");
        System.out.println("radius = "+radius);
        System.out.println("area = "+ getArea());
        System.out.println("diameter ="+ getDiameter());
        System.out.println("coordinate = ("+xcoor+","+ycoor+")");
    }
    
    

}
