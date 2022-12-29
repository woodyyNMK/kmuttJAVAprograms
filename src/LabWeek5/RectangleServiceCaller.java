package LabWeek5;
public class RectangleServiceCaller {
    public static void main(String[] args) {
        double w = 15;
        double h = 10;
        double perimeter = RectangleService.getPerimeter(w, h);
        double area = RectangleService.getArea(8,7);

        System.out.println(perimeter);
        System.out.println(area);
    }
}