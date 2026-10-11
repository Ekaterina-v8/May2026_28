package oopsConcept;

public class Shape 

{
	
	public void area(int radius) 
	{
		double circleArea = 3.14 * radius * radius;
		
		System.out.println("Calculate circle area: " + circleArea);
				
	}
	
	public void area(int lenght,int breadth) 
	{
		
		int rectangleArea = lenght * breadth;
	
		System.out.println("Calculated Rectangle Area: " + rectangleArea);
				 
	}
	
     public static void main(String[] args) 
	
	{
    	 Shape sc = new Shape();
    	 sc.area(7);
    	 sc.area(3, 4);
    	 
	}

}
