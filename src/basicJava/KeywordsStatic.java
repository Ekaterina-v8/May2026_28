package basicJava;

public class KeywordsStatic 
{
	static int x = 100;
	
	public static void printdata()
	
	{
		
		System.out.println(x);
	}
	
	
	public void meth2()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[]args) 
	{
		printdata();
		
		KeywordsStatic ks = new KeywordsStatic();
		ks.meth2();
		
	}

}
