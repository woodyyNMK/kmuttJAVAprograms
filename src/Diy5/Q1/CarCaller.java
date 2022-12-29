package Diy5.Q1;

class Car{
    private double id;
    private String brandName;
    private String color;
    private String ownerName;
    private double totalDrivingDist;
    public static double accumulatedDist;

    public Car(int id){
        this(id,"abc","red","owner");
    }
    public Car(int id,String brandName,String color,String ownerName){
        this.id = id;
        this.brandName=brandName;
        this.color=color;
        this.ownerName=ownerName;
    }

    public double getId(){
        return id;
    }
    public void setId(double id){
        this.id = id;
    }

    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public double getTotalDrivingDist(){
        return totalDrivingDist;
    }
    public void setTotalDrivingDist(double totalDrivingDist){
        this.totalDrivingDist = totalDrivingDist;
    }

    public void drive(double x){
        accumulatedDist += x;
        totalDrivingDist += x;
    }
}

public class CarCaller {
	public static void main(String[] args){
		Car car1 = new Car(15012016);
		Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
		Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yello", "Smith");
		
		car1.setBrandName("Lamborghini Veneno");
		car1.setColor("Black");
		car1.setOwnerName("James");
		
		car1.drive(120);
		car2.drive(300);
		car2.drive(50);
		car1.drive(15);
		
		System.out.println("----- car1 Info -----");
		System.out.println("id: "+car1.getId()+ 
				" brand: "+ car1.getBrandName() +
				" color: "+ car1.getColor() + 
				" owner: "+ car1.getOwnerName() +
				" total driving distance: " + car1.getTotalDrivingDist());
		
		System.out.println("----- car2 Info -----");
		System.out.println("id: "+car2.getId()+ 
				" brand: "+ car2.getBrandName() +
				" color: "+ car2.getColor() + 
				" owner: "+ car2.getOwnerName() +
				" total driving distance: " + car2.getTotalDrivingDist());

		System.out.println("----- car3 Info -----");
		System.out.println("id: "+car3.getId()+ 
				" brand: "+ car3.getBrandName() +
				" color: "+ car3.getColor() + 
				" owner: "+ car3.getOwnerName() +
				" total driving distance: " + car3.getTotalDrivingDist());
				
		System.out.println("---Accumulated Driving Distance---");
		System.out.println(Car.accumulatedDist);
	}
}