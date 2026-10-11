package oopsConcept;


public class QA4 extends QA2 implements QA3I
{
	
	public void division(int a, int b) 
	{
		
		int c = a / b;
		System.out.println("division between 2 numbers: " + c);
	}
 	
	
	
	public static void main(String[]args) 
	
	{
		
		
		QA4 q4 = new QA4();
		
		
		q4.division(40, 20);
		//q4.multiplication(20, 30);
		
		q4.substraction(20, 30);
		
		//QA1 q1 = new QA1();
		q4.addition(20, 30);
		
		//System.out.println(q4.x);
		q4.qa3im();
		
	}



	
	public void qa3im() 
	{
		System.out.println("this is QA3I method");
		
	}

}
