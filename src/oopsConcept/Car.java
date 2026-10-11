package oopsConcept;

public class Car extends Vehicle 
{

	public void speed() 
	{
		System.out.println("The Car is cruising smoothly at 75 mph");
	}
	
	public static void main(String[] args) {
		
        Car myCar = new Car();
		
		myCar.speed();

	}

}
