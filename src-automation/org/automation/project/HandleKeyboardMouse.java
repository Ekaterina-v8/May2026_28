package org.automation.project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class HandleKeyboardMouse 
{
	WebDriver driver;
	
	@Test
	public void HandleFrames() throws Exception 
	{
		
	    driver = new ChromeDriver(); 
    	
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		driver.switchTo().defaultContent();
		
	}
	
	
	@Test(enabled=false)
	public void HandleAlerts() throws Exception 
	{
		
	    driver = new ChromeDriver(); 
    	
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert();
		
	}
		
		
	
	@Test(enabled=false)
	public void Handlemouse() throws Exception 
	{
		
	    driver = new ChromeDriver(); 
    	
		driver.manage().window().maximize();
		
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//right click
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	
	    act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform(); 
	    
	    //act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
	    
	    act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
	
	    Set<String> windowsid = driver.getWindowHandles();
	    System.out.print(windowsid);
	    
	    //Iterator<String> itr = windowsid.iterator(); 
	    
	    //String win1 = itr.next();
	    //String win2 = itr.next();
	    
	    //driver.switchTo().window(win2);
	    //driver.switchTo().window(win1);
	    
	}
	
		
		
	
	@Test(enabled=false)
	public void HandleKeyboard() throws Exception 
	{
		
	    driver = new ChromeDriver(); 
    	
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("john1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("john1234").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
	}

}		
		
		
		
		
		

