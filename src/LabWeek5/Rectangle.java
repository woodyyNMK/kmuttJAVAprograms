package LabWeek5;
public class Rectangle {
    double width;
    double height;

    public void setWidthHeight(double w, double h){
        width = w;
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setHeight(double h){
        height = h;
    }

    public double getPerimeter(){
        return 2*width + 2*height;
    }
    public double getArea(){
        return width*height;
    }
    public void printInfo(){
        System.out.println("This Rectangle has - ");
        System.out.println("width :" + width);
        System.out.println("height :" + height);
        System.out.println("area: " + getArea());
        System.out.println("perimeter: " + getPerimeter());
    }
}
