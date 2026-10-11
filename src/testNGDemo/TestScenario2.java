package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test(priority=1)
	public void first_testcase() 
	{
		System.out.println("first_testcase");
		
		System.out.println("step1");
		
		Assert.assertEquals("Hello", "Hello");
		
        System.out.println("step2");
		
		Assert.assertEquals("Hello", "Hello Testng"); // failed
		
        System.out.println("step3");
		
		Assert.assertEquals("Hello", "Hello Testng");
	}
	
	@Test(priority=2)
	public void second_testcase() 
	{
		System.out.println("second_testcase");
	}
	
	@Test(priority=0)
	public void third_testcase() 
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void fourth_testcase() 
	{
		System.out.println("fourth_testcase");
		
		Assert.assertEquals("Hello", "Hello Testng");
	}
	@Test(priority=5)
	public void fifth_testcase() 
	{
		System.out.println("fifth_testcase");
		
		Assert.assertEquals("Hello", "Hello Testng");
	}
	
	@Test(priority=6)
	public void sixth_testcase() 
	{
		System.out.println("fifth_testcase");
	}
	
	
	
}
