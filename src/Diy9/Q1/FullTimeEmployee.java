package Diy9.Q1;

public class FullTimeEmployee extends Employee {
    private double salary;
    
    public FullTimeEmployee(){
        this("firstname","lastname");
    }
    public FullTimeEmployee(String firstname, String lastname){
        this("firstname","lastname",0.0);
    }
    public FullTimeEmployee(String firstname, String lastname, double salary){
        super(firstname,lastname);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Salary: "+this.getSalary());
    }
}
