package oopsConcept;


public class QA1 
{
	
	int x = 500;
	
	
	
	
	public void addition(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition of 2 numbers: " + c);
	 }
	
	
	public void addition(int a, int b, int c)
	{
		int d = a + b + c;
		System.out.println("Addition of d numbers: " + d);
	 }
	
	
	public void addition(int a, float b)
	{
		float c = a + b;
		System.out.println("Addition of 2 numbers: " + c);
	}
	
	public void addition(float b, int a)
	{
		float c = a + b;
		System.out.println("Addition of 2 numbers: " + c);
	}
	
	
	
	public static void main(String[]args) 
	{
		QA1 q1 = new QA1();
		//q1.addition(20, 30);
		q1.addition(20, 30, 40);
		
		//QA2 q2 = new QA2();
		//q2.addition(20, 30);
		
	}
	
     public static void main(int a) 
	
	{
		int b = a*a;
		System.out.println(b);
		
	}

}
