package LabWeek5;
public class CircleCaller {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        // c1.setRadius(2.5);
        // c1.setCenter(1,2);
        // System.out.println(c1.getRadius());
        // System.out.println(c1.getArea());
        // System.out.println(c1.getPerimeter());
        // System.out.println(c1.getDiameter());

        // System.out.println(c1.getAreaOfCircles(2));
        // c1.printInfo();

        c1.setRadius(2.5);
        System.out.println("---After the first Circle created---");
        System.out.println(c1.getNumberOfCircle());
        System.out.println(Circle.getNumberOfCircle());
        System.out.println(c1.countCircle);
        System.out.println(Circle.countCircle);

        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.println("---After the second Circle created---");
        System.out.println(c2.getNumberOfCircle());
        System.out.println(Circle.getNumberOfCircle());
        System.out.println(c2.countCircle);
        System.out.println(Circle.countCircle);

        Circle c3 = new Circle();
        System.out.println("---After the third Circle created---");
        System.out.println(c3.getNumberOfCircle());
        System.out.println(Circle.getNumberOfCircle());
        System.out.println(c2.countCircle);
        System.out.println(Circle.countCircle);

        Circle c4 = new Circle();
        System.out.println("---After the fourth Circle created---");
        System.out.println(c4.getNumberOfCircle());
        System.out.println(Circle.getNumberOfCircle());
        System.out.println(c4.countCircle);
        System.out.println(Circle.countCircle);
    }
}
