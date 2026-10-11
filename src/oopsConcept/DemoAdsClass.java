package oopsConcept;

public abstract class DemoAdsClass 
{
	int a = 30;
	
	public void meth1()
	{
		a = 40;
		System.out.println("this is a concrete method");
	}
	
	public abstract void meth2();

	public static void main(String[] args) {
		//DemoAdsClass dac = new DemoAdsClass();

	}

}
