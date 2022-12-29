package Lab5;
public class DIYRectangle {
    public double width;
    public double height;
    
    public void setWidthHeight(double w, double h){
        width = w;
        height = h;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getArea(){
        return width*height;
    }
    
    public void printInfo(){
        System.out.println("===========================");
        System.out.println("Width of Rectange = "+ width);
        System.out.println("Height of Rectange = "+ height);
        System.out.println("Perimeter of Rectangle = "+ getPerimeter());
        System.out.println("Area of Rectangle = "+getArea());
    }
}
