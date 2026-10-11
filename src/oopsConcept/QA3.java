package oopsConcept;


public class QA3 extends QA2
{
	
	public void multiplication(int a, int b) 
	{
		
		int c = a * b;
		System.out.println("multiplication between 2 numbers: " + c);
	}
 	
	
	
	public static void main(String[]args) 
	
	{
		
		
		QA3 q3 = new QA3();
		q3.multiplication(20, 30);
		
		//q3.substraction(20, 30);
		
		//QA1 q1 = new QA1();
		q3.addition(20, 30);
		
		//System.out.println(q3.x);
		
	}

}
