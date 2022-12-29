package Lab5;
public class E1CircleServiceMain {
    public static void main(String[] args) {
        double r= 2.0;
        double area = E1CircleService.getArea(r);
        double diameter = E1CircleService.getDiameter(r);
        double perimeter = E1CircleService.getPerimeter(r);
        
        System.out.println("Area: "+ area);
        System.out.println("Diameter :"+ diameter);
        System.out.println("Perimeter: "+ perimeter);
    }
}
