package Lab5;
class Car {
    public int ID;
    public String brand;
    public String color;
    public String name;
    public double distance;
    public static double accumulatedDist;
    
    public Car(int id){
        ID = id;
    }
      
    public Car(int id, String bd, String c, String n){
        ID = id;
        brand = bd;
        color = c;
        name = n;
    }
    
    //Setter Methods
    public void setID(int id){
        ID = id;
    }
    public void setBrand(String bd){
        brand = bd;
    }
    public void setColor(String c){
        color = c;
    }
    public void setOwner(String n){
        name = n;
    }

    //Getter Methods
    public int getId(){
        return ID;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public String getOwner(){
        return name;
    }
    public double getTotalDrivingDist(){
        return distance;
    }

    //drive functions
    public void drive(double d){
        distance += d;
        accumulatedDist += d;
    }
	
}

public class CarCaller {
	public static void main(String[] args){
		Car car1 = new Car(15012016);
		Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
		Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yello", "Smith");
		
		car1.setBrand("Lamborghini Veneno");
		car1.setColor("Black");
		car1.setOwner("James");
		
		car1.drive(120);
		car2.drive(300);
		car2.drive(50);
		car1.drive(15);
		
		System.out.println("----- car1 Info -----");
		System.out.println("id: "+car1.getId()+ 
				" brand: "+ car1.getBrand() +
				" color: "+ car1.getColor() + 
				" owner: "+ car1.getOwner() +
				" total driving distance: " + car1.getTotalDrivingDist());
		
		System.out.println("----- car2 Info -----");
		System.out.println("id: "+car2.getId()+ 
				" brand: "+ car2.getBrand() +
				" color: "+ car2.getColor() + 
				" owner: "+ car2.getOwner() +
				" total driving distance: " + car2.getTotalDrivingDist());

		System.out.println("----- car3 Info -----");
		System.out.println("id: "+car3.getId()+ 
				" brand: "+ car3.getBrand() +
				" color: "+ car3.getColor() + 
				" owner: "+ car3.getOwner() +
				" total driving distance: " + car3.getTotalDrivingDist());
				
		System.out.println("---Accumulated Driving Distance---");
		System.out.println(Car.accumulatedDist);
	}
}

