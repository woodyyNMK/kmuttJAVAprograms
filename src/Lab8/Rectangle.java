package Lab8;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        this(1.0, 1.0);
    }

    public Rectangle(double w, double h){
        this(w, h, "green", true);
    }
    public Rectangle(double w, double h, String color, boolean filled){
        super(color, filled);
        this.height = h;
        this.width = w;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidthHeight(double w, double h){
        this.height = h;
        this.width = w;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}
