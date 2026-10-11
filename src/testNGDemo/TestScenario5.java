package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario5 
{

	@Test(groups="Smoke")
	public void first_testcase() 
	{
		System.out.println("first_testcase");
		
	}
	
	@Test(groups="Regression")
	public void second_testcase() 
	{
		System.out.println("second_testcase");
		
	}
	
	@Test
	public void third_testcase() 
	{
		System.out.println("third_testcase");
		
	}
	
	@Test(groups="Sanity")
	public void fourth_testcase() 
	{
		System.out.println("fourth_testcase");
	}
	
	
	@Test(groups={"Regression", "Sanity"})
	public void seventh_testcase() 
	{
		System.out.println("seven_testcase");
	}
	
	
	@Test(groups="julyrelease2006")
	public void fifth_testcase() 
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase() 
	{
		System.out.println("fifth_testcase");
	}
	
	
	
}
