package Impt;
public class Box {
    private final double ONE_UNIT = 1.0;
    private double width = ONE_UNIT;
    private double height = ONE_UNIT;
    private double depth = ONE_UNIT;

    public Box(){

    }
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getCapacity(){
        double volume = width * height * depth;
        return volume;
    }
    public double getArea(){
        double area = width*depth;
        return area;
    }
}
