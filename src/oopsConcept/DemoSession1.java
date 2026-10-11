package oopsConcept;

import testPkg.FirstProgram;

public class DemoSession1 

{
	
	public static void main(String[] args) 
	{
		
		int a = 200;
		float b=30;
		
		System.out.println(a);
		System.out.println(b);
		
		FirstProgram fp = new FirstProgram();
		fp.printValues();
		
		System.out.println(fp.a);
		
		
		DemoEncap de = new DemoEncap();
		System.out.println(de.getName());
		System.out.println(de.getAge());
		
		System.out.println(de.getEmail());

	}

}
