package testPkg;

public class FirstProgram 
{
	public int a = 100;
	float b = 25.5f;
	
	public void printValues()
	
	{
		
	   int a = 50;
	   int b = 100;
	   
	   int c =a+b;
	   
	   System.out.println("This is first program.");
	   
	   System.out.println(a);
	   System.out.println(c);
	   
		
		
		
	}

	public static void main(String[] args) 
	
	{
		
		FirstProgram fp = new FirstProgram();
		fp.printValues();
		
		System.out.println(fp.a);
		
		//DemoSession1 d1 = new DemoSession1();
		//d1.main(args);
		

	 }

}
