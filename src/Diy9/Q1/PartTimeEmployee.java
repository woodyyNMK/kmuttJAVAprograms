package Diy9.Q1;

public class PartTimeEmployee extends Employee {
    private double wage;
    private double accumulativeHour;

    public PartTimeEmployee(){
        this("fistname","lastname");
    }
    public PartTimeEmployee(String firstname, String lastname){
        this("fistname","lastname",1);
    }
    public PartTimeEmployee(String firstname,String lastname, double wage){
        super(firstname,lastname);
        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }
    public void setWage(double wage){
        this.wage = wage;
    }

    public double getAccumulativeHour(){
        return accumulativeHour;
    }
    public void work(int hours){
        accumulativeHour += hours;
    }

    public double getTotalMoneyPaid(){
        return wage*accumulativeHour;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Total wage: " +this.getTotalMoneyPaid());
    }
}
