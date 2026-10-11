package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario3 
{

	@Test
	public void first_testcase() 
	{
		System.out.println("first_testcase");
		
        System.out.println("step1");
        
        SoftAssert sa = new SoftAssert();
        
        sa.assertEquals("Hello", "Hello");
		
        System.out.println("step2");
		
		sa.assertEquals("Hello", "Hello Testng"); // failed
		
        System.out.println("step3");
		
		sa.assertEquals("Hello", "Hello Testng");
		
		sa.assertAll();
		
	}
	
	@Test
	public void second_testcase() 
	{
		System.out.println("second_testcase");
	}
	
	@Test(enabled=false) //disable
	public void third_testcase() 
	{
		System.out.println("third_testcase");
	}
	
	@Test(enabled=true)
	public void fourth_testcase() 
	{
		System.out.println("fourth_testcase");
	}
	@Test
	public void register() 
	{
		System.out.println("register");
		Assert.assertEquals("Hello", "Hello Testng");
	}
	
	@Test(dependsOnMethods="register")
	public void login() 
	{
		System.out.println("login");
	}
	
	
	
}
