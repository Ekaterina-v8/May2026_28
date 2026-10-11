package oopsConcept;

public class Vehicle {
	
	public void speed() 
	{
		System.out.println("Vehicles with different speeds.");
	}

	public static void main(String[] args) {
		
		Vehicle myVehicle = new Vehicle();
		Vehicle myCar = new Car();
		Vehicle myBike = new Bike();
		Vehicle myTruck = new Truck();
		
		myVehicle.speed();
		myCar.speed();
		myBike.speed();
		myTruck.speed();
		
		
		
		

	}

}
