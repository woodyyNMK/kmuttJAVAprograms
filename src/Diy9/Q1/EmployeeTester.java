package Diy9.Q1;

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