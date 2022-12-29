package Quiz3.Q1;

public class Cuboid {
    private double width;
    private double height;
    private double length;

    public Cuboid(){
        this(1.0,1.0,1.0);
    }
    public Cuboid(double width,double height,double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getVolumn(){
        return width*height*length;
    }
    public double getSurface(){
        return 2*(width*height)+2*(height*length)+2*(width*length);
    }
}
