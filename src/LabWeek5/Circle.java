package LabWeek5;
public class Circle {
    double radius;
    final double PI = 3.14159; 
    double xcoor;
    double ycoor;
    public static int countCircle;

    
    public static int getNumberOfCircle(){
        return countCircle;
    }

    public void setRadius(double r){
        radius = r;
        countCircle++;
    }
    public void setCenter(int a , int b){
        xcoor = a;
        ycoor = b;
    }
    public void printInfo(){
        System.out.println("The circle has :");
        System.out.println("radius = " + radius);
        System.out.println("area = " + getArea());
        System.out.println("diameter = " + getDiameter());
        System.out.println("coordinate = ("+ xcoor + "," + ycoor +")");
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = PI*radius*radius;
        return area;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }

    // public double getAreaOfCircles(int n){
    //     return n*PI*radius*radius;
    // }
    public double getAreaOfCircles(int n){
        return n*getArea();
    }
}
