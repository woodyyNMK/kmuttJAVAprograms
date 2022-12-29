package LabWeek5;
public class RectangleCaller {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.setWidthHeight(5, 10);
        r1.printInfo();

        r2.setWidthHeight(2.5, 1.5);
        r2.printInfo();

        r3.setWidthHeight(25, 5);
        r3.printInfo();
    }
}
