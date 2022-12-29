package Lab9;


public class LineItem{
    private Product product;
    private int quantity;
    private int lineItemId;
    private static int count;

    public LineItem(Product product, int quantity) {
        count++;
        this.product = product;
        this.quantity = quantity;
        this.lineItemId = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(int lineItemId) {
        this.lineItemId = lineItemId;
    }
  
    public double calculateTotalAmount(){
        return quantity*(product.getPrice());
    }
    public void printDetail(){
        System.out.println("LineIem ID: "+ lineItemId+ " "+
                            "Product: "+ product.getProductName()+" "+
                            "Quantity: "+ quantity + " "+
                            "Total Amount" + calculateTotalAmount());
    }
    
}
