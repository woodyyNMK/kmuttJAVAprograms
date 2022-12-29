package Diy9.Q1;

public class Employee {
    private String firstname;
    private String lastname;
    private int employeeId;
    private static int accumulatedCount;

    public Employee(){
        this("firstname","lastname");
    }
    public Employee(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        accumulatedCount++;
        employeeId = accumulatedCount;
    }
    
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void printInfo(){
        System.out.println("Employee name: "+ this.getFirstname() +" "+this.getLastname());
        System.out.println("Employee Id: "+this.getEmployeeId());
    }
}
