package DnD2021.Q8UML2ndchance;
import java.util.ArrayList;
public class Invoice {
    private int id;
    private ArrayList<LineItem> lineItems ;
    
    public Invoice(int id){
        this.id = id;
        this.lineItems = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public ArrayList<LineItem> getLineItems(){
        return lineItems;
    }

    public void addLineItem(LineItem line){
        if(lineItems.contains(line)){
            System.out.println("This line item already exists.");
        }else{
            lineItems.add(line);
        }
    }
    public void removeLineItem(LineItem line){
        if(!lineItems.contains(line)){
            System.out.println("This line item does not exist.");
        }else{
            lineItems.remove(line);
        }
    }
}
