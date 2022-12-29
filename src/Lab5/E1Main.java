package Lab5;
// import ClassObject.BankAccount;
public class E1Main {
    public static void main(String[] args) {
//        E1Circle c = new E1Circle();
//        c.setRadius(2.5);
//        System.out.println(c.getRadius());
//        System.out.println(c.getArea());
//        System.out.println(c.getPerimeter());
//        
//        System.out.println(c.getAreaofCircles(2));
//        
//        c.printInfo();
        System.out.println("//----------------------------------------//");
        
        E1Circle c1 = new E1Circle();
        c1.setRadius(2.5);
        System.out.println("---After the first Circle created---");
        System.out.println(c1.getNumberofCircleObject());
        System.out.println(E1Circle.getNumberofCircleObject());
        System.out.println(c1.countCircleObject);
        System.out.println(E1Circle.countCircleObject);
        
        E1Circle c2 = new E1Circle();
        c2.setRadius(4);
        System.out.println("---After the second Circle created---");
        System.out.println(c2.getNumberofCircleObject());
        System.out.println(E1Circle.getNumberofCircleObject());
        System.out.println(c2.countCircleObject);
        System.out.println(E1Circle.countCircleObject);
        
        E1Circle c3 = new E1Circle();
        c3.setRadius(2.5);
        System.out.println("---After the third Circle created---");
        System.out.println(c3.getNumberofCircleObject());
        System.out.println(E1Circle.getNumberofCircleObject());
        System.out.println(c3.countCircleObject);
        System.out.println(E1Circle.countCircleObject);
        
        
        
    }
    
    
}
