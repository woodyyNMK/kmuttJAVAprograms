package Lab5;
public class DIYRectangleMain {
    public static void main(String[] args) {
        DIYRectangle r1 = new DIYRectangle();
        DIYRectangle r2 = new DIYRectangle();
        DIYRectangle r3 = new DIYRectangle();
        
        r1.setWidthHeight(5, 10);
        r2.setWidthHeight(2.5, 1.5);
        r3.setWidthHeight(25, 5);
        
        r1.printInfo();
        r2.printInfo();
        r3.printInfo();
        
    }
}
