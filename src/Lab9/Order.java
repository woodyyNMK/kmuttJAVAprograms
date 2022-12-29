package Lab9;


public class Order {
    private Customer customer;
    private LineItem lineitems[];
    private int orderId;
    private double totalAmount;
    private static int count;

    public Order(Customer c) {
        this.orderId = count++;
        this.totalAmount = 0;
        this.lineitems = new LineItem[20];
        this.customer = c;
    }
    
    public void addLineItem(LineItem lineitem, int index){
        if(lineitems[index] == null){
            lineitems[index] = lineitem;
            System.out.println("Add Line item Successfully.");
        }
        else{
            System.out.println("The array is not empty. Line item cannot be added");
        }
    }
    public void addLineItem(LineItem lineitem){
        boolean addSuccess = false;
        for(int i = 0; i<lineitems.length; i++){
            if(lineitems[i] == null){
                lineitems[i] = lineitem;
                addSuccess = true;
                break;
            }
        }
        if(addSuccess){
            System.out.println("Add Line item successfully");
            
        }
        else{
            System.out.println("Your basket is full. Cannot add a line item");
        }
    }
    
    public void removeLineItemByArrayIndex(int index){
        if(lineitems[index] != null){
            lineitems[index] = null;
            System.out.println("Remove line items successfully");
        }
        else{
            System.out.println("The array is empty. Nothing removed.");
        }
    }
    
    public void calculateTotalAmount(){
        double sum = 0;
        for(LineItem l: lineitems){
            if(l != null){
                sum = sum + l.calculateTotalAmount();
            }
        }
        totalAmount = sum;
    }
    
    public double getTotalAmount(){
        calculateTotalAmount();
        return totalAmount;
    }
    public double getOrderId(){
        return orderId;
    }
    public void printLineItems(){
        for(LineItem l : lineitems){
            if(l != null){
                l.printDetail();
            }
        }
    }
    
    
}
