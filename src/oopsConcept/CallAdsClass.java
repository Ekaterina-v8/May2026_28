package oopsConcept;

public class CallAdsClass extends DemoAdsClass 
{

	
	
	public void meth2() 
	{
		System.out.println("this is parent class method");
		
	}
	
	
	public static void main(String[] args) {
		
		CallAdsClass cac = new CallAdsClass(); 
		cac.meth1();
		cac.meth2();

	}

	

}
