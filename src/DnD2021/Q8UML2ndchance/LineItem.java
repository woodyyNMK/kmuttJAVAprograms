package DnD2021.Q8UML2ndchance;

public class LineItem {
    private String product;
    private int quantity;
    private double unit_price;
    private double line_sum;
    
    public LineItem(String product,int quantity,double unit_price ){
        this.product=product;
        this.quantity=quantity;
        this.unit_price=unit_price;
    }
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product = product;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getUnit_price(){
        return unit_price;
    }
    public void setUnit_price(double unit_price){
        this.unit_price = unit_price;
    }
    public double getLine_sum(){
        return quantity*unit_price;
    }
}
