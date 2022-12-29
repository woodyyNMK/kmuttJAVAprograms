package Lab7;
public class GeometricObject {
    private String color;
    private boolean filled;
    
    public GeometricObject(){
        this.color = "blue";
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void printInfo(){
        System.out.println("Color = "+ color);
        if(filled)
            System.out.println("Filled = "+ filled);
        else
            System.out.println("Not Filled = "+ filled);
    }
    
}
