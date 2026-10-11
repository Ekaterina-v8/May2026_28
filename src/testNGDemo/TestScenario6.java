package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario6 
{

	@Test
	public void first_testcase() 
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello Testng");
	}
	
	@Test
	public void second_testcase() 
	{
		System.out.println("second_testcase");
		
	}
	
	@Test
	public void third_testcase() 
	{
		System.out.println("third_testcase");
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	
	@Test
	public void fourth_testcase() 
	{
		System.out.println("fourth_testcase");
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	@Test
	public void fifth_testcase() 
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase() 
	{
		System.out.println("fifth_testcase");
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	
	
	
}
