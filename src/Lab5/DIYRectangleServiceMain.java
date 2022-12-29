package Lab5;
public class DIYRectangleServiceMain {
    public static void main(String[] args) {
        double w = 15;
        double h = 10;
        double perimeter = DIYRectangleService.getPerimeter(w, h);
        System.out.println("Perimeter: "+ perimeter);
        
        double w1 = 8;
        double h1 = 7;
        double area = DIYRectangleService.getArea(w1, h1);
        System.out.println("Area: "+ area);

    }
 
}
