package LabWeek5;
public class CircleServiceCaller {
    public static void main(String[] args) {
        double r = 2.0;
        double area = CircleService.getArea(r);
        double diameter = CircleService.getDiameter(r);
        double perimeter = CircleService.getPerimeter(r);

        System.out.println("Area: " + area);
        System.out.println("Diameter: "+diameter);
        System.out.println("Perimeter: "+perimeter);
    }
}
