package org.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentCalendar 
{
	WebDriver driver;
	
	@Test(enabled=false)
	public void calendar_dob_textbox() 
	{
    	
    	driver = new ChromeDriver(); // to launch incognito windows
    	
		
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/calendars/");
		
		driver.findElement(By.xpath("//input[contains(@name, 'selectorenteradate')]")).sendKeys("2000-05-10");
		
		//driver.findElement(By.xpath("[aria-label='Sat Jun 10 2000Use the space key to select the date.']")).click();
		
		//driver.quit();
		
		
		
	
	}
	
	

	@Test
	public void calendar_icon_based() 
	{
    	
    	driver = new ChromeDriver(); // to launch incognito windows
    	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/");
		
		driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
		
		//driver.findElement(By.cssSelector("[data-selenium-date='2026-07-03']")).click();
		
		//driver.findElement(By.cssSelector("[data-selenium-date='2026-07-05']")).click();
		
		
		
		
		
		
		
	
	}
}
