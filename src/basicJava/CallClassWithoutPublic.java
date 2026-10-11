package basicJava;

import testPkg.FirstProgram;

public class CallClassWithoutPublic 

{
	public static void main(String[]args)
	
	{
		FirstProgram fp = new FirstProgram();
		fp.printValues();
		
		System.out.println(fp.a);
		
	}

}
