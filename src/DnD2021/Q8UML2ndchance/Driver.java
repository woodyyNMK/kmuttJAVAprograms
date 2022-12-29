package DnD2021.Q8UML2ndchance;

// import java.util.ArrayList;
public class Driver{
    public static void main(String[] args) {
        Driver t = new Driver();
        Invoice in1 = new Invoice(001);
        LineItem l1 = new LineItem("Lays", 5, 20);
        LineItem l2 = new LineItem("KitKat", 2, 15);
        LineItem l3 = new LineItem("CocaCola", 2, 17.5);
        in1.addLineItem(l1);
        in1.removeLineItem(l3);
        in1.addLineItem(l2);
        in1.addLineItem(l3);
        in1.addLineItem(l1);
        System.out.println("----------- Invoice " + in1.getId() + " Info -----------");
        t.printLineItem(in1);
        System.out.println("Total " + t.getTotal(in1));

        Invoice in2 = new Invoice(003);
        in2.setId(002);
        LineItem l4 = new LineItem("UHT", 6, 8);
        LineItem l5 = new LineItem("Milo-Icecream", 2, 15);
        LineItem l6 = new LineItem("7-select", 2, 7.5);
        l4.setQuantity(3);
        l5.setUnit_price(10);
        l6.setProduct("Nestle");
        in2.addLineItem(l4);
        in2.addLineItem(l5);
        in2.addLineItem(l6);
        System.out.println("----------- Invoice " + in1.getId() + " Info -----------");
        t.printLineItem(in2);
        System.out.println("Total " + t.getTotal(in2));
    }

    public double getTotal(Invoice in) {
        double total = 0;
        for (int i = 0; i < in.getLineItems().size(); i++) {
            total += in.getLineItems().get(i).getLine_sum();
        }
        return total;
    }

    public void printLineItem(Invoice in) {
        for (int i = 0; i < in.getLineItems().size(); i++) {
            LineItem l = in.getLineItems().get(i);
            System.out.println(l.getProduct() + " " + l.getQuantity() + " " + l.getUnit_price());
        }
    }
}