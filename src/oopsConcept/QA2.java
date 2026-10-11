package oopsConcept;


public class QA2 extends QA1
{
	
	final int x = 100;
	
	public void printdataX() 
	{
		//x = 150; 
		final int x = 200; //local varibale, constant
		//x = 300;
		
		System.out.println(x); //200
		System.out.println(this.x); //100
		
		System.out.println(super.x);
		
		super.addition(20, 30);
		
		
	}
	
	
	
	public QA2()
	{
		System.out.println("this is QA1 constructor");
	}
	
	
	public void addition(int a, int b)
	{
		int c = a*a + b*b;
		System.out.println("Addition of 2 numbers: " + c);
	 }
	
	
	public void substraction(int a, int b) 
	{
		int c = a - b;
		System.out.println("substractions between 2 numbers: " + c);
	}
 	
	public static void main(String[]args) 
	
	{
		
		
		QA2 q2 = new QA2();
		q2.substraction(20, 30);
		
		//QA1 q1 = new QA1();
		q2.addition(20, 30);
		//q2.addition(20, 30, 40);
		
		//System.out.println(q2.x);
		
		
		q2.qa1im();
		
		q2.printdataX();
		
	}

	
	public void qaim() 
	{
		System.out.println("this is method QA1I");
		
	}

	public void qa1im() 
	{
		System.out.println("this is method QA1I");
		
	}

}
