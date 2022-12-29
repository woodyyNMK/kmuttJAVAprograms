package Lab9;
public class EmployeeTester {
	public static void main(String[] args){
		FullTimeEmployee john = new FullTimeEmployee();
		john.setFirstname("John");
		john.setLastname("Bravo");
		john.setSalary(10000);
		
		FullTimeEmployee marry = new FullTimeEmployee("Marry", "Brown", 5800);
		
		PartTimeEmployee harry = new PartTimeEmployee("Harry", "Potter");
		harry.setWage(30);
		harry.work(30);
		harry.work(15);
		
		PartTimeEmployee david = new PartTimeEmployee();
		david.setFirstname("David");
		david.setLastname("Gminer");
		david.setWage(15);
		david.work(20);
		david.work(50);
		
		john.printInfo();
		marry.printInfo();
		harry.printInfo();
		david.printInfo();
	}
}

class Employee {
    //put your code here
    private String firstname;
    private String lastname;
    private int employeeId;
    private static int accumulativeCount=1;
    
        public Employee(){
            accumulativeCount++;
        }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.employeeId = accumulativeCount++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeedId) {
        this.employeeId = employeedId;
    }
    
	public void printInfo(){
		System.out.println("Employee name: "+this.getFirstname() + " " + this.getLastname());
		System.out.println("Employee id: "+this.getEmployeeId());
	}
}

class FullTimeEmployee extends Employee {
	//put your code here
    private double salary;

    public FullTimeEmployee(){
        this("D", "d");
    }
    public FullTimeEmployee(String firstname, String lastname) {
        this(firstname, lastname, 0.0);
    }

    public FullTimeEmployee(String firstname, String lastname, double salary) {
        super(firstname, lastname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
	
    @Override
	public void printInfo(){
		super.printInfo();
		System.out.println("Salary: "+this.getSalary());
	}
}

class PartTimeEmployee extends Employee {
    //put your code here
	private double wages;
        private double accumulativeHour;
        
        public PartTimeEmployee(){
        this("D", "d");
        }
        
        public PartTimeEmployee(String firstname, String lastname) {
            this(firstname, lastname, 0.0);
        }

        public PartTimeEmployee(String firstname, String lastname, double wages) {
            super(firstname, lastname);
            this.wages = wages;
        }
        public void work(int hours){
            accumulativeHour += hours;
        }
        public double getTotalMoneyPaid(){
            return wages*accumulativeHour;
        }
        public double setWage() {
            return wages;
        }

        public void setWage(double wages) {
            this.wages = wages;
        }
        
        
        @Override
	public void printInfo(){
		super.printInfo();
		System.out.println("Total Wage: "+this.getTotalMoneyPaid());
	}
}


