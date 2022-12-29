package Lab9;


public class Member extends Customer {
    private double points;

    public Member(String fristname, String lastname, int customerId) {
        super(fristname, lastname, customerId);
        this.points = 0;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
    public double convertPoints(double p){
        double converted = p * 20;
        points = points - p;
        return converted;
    }
    
}
