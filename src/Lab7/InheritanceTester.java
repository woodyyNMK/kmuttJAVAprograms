package Lab7;
public class InheritanceTester {
    public static void main(String[] args) {
        // InheritanceTester tester = new InheritanceTester();
        
        
        GeometricObject g1 = new GeometricObject();
        printGeometricObjectInfo(g1);
        //g1.printInfo();
        Circle c1 = new Circle();
        printGeometricObjectInfo(c1);
        //c1.printInfo();
        Rectangle r1 = new Rectangle();
        printGeometricObjectInfo(r1);
        //r1.printInfo();
        //System.out.println(r1.getPerimeter());
    }
    public static void printGeometricObjectInfo(GeometricObject g){
        g.printInfo();
    }
}
