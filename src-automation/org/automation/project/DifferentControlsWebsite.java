package org.automation.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentControlsWebsite 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception 
	{
		
		ChromeOptions co = new ChromeOptions();
    	co.addArguments("--incognito");
    	
    	
    	driver = new ChromeDriver(co); // to launch incognito windows
    	
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300)); //upto wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Thread.sleep(Duration.ofSeconds(300)); // fixed wait 
		
		String act_login_url = driver.getCurrentUrl();
		
		String login_title = driver.getTitle();
		
		Assert.assertEquals(act_login_url, "https://mail.rediff.com/cgi-bin/login.cgi");
		
	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		
		//driver.close();   // will close one active window/tab
		driver.quit(); //will close all the tab/window provided those tabs/windows open by automated software
				
	}

	
	
    @Test(enabled=true)
	public void login_functionality() throws Exception 
	{
        WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("john.seo");
		
		username.clear();
		username.sendKeys("david.seo");
		
		driver.findElement(By.name("passwd")).sendKeys("pass1234");
		
		System.out.println(driver.findElement(By.id("remember")).isSelected()); // true
		
		Assert.assertEquals(driver.findElement(By.id("remember")).isSelected(), true, "this output did not match");
		
		CaptureScreenshot.testresults(driver, "login_functionality_1");
		
		driver.findElement(By.id("remember")).click();
		
		System.out.println(driver.findElement(By.id("remember")).isSelected()); //false
		
		//driver.findElement(By.className("signin-btn")).click();
		
		System.out.println(driver.findElement(By.className("signin-btn")).isEnabled()); //true
		
		System.out.println(driver.findElement(By.className("signin-btn")).isDisplayed()); //true
		
		CaptureScreenshot.testresults(driver, "login_functionality_2");
         
   }
    
    @Test(enabled=true)
	public void create_new_account_functionality() throws Exception 
	{
    	
		driver.findElement(By.cssSelector("[title='Create new Rediffmail account']")).click();
		
		driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(), "https://register.rediff.com/register/register.php?FormName=user_details");
		
		String act_fullname = driver.findElement(By.xpath("//label[text()='Full Name']")).getText();
		Assert.assertEquals(act_fullname, "Full Name");
		
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Full Name']")).getLocation());
		//System.out.println(driver.getPageSource());
		
		
		String act_fullname_textbox = driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
		Assert.assertEquals(act_fullname_textbox, "Enter your full name");		
				
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
		
		driver.findElement(By.cssSelector("[placeholder='Enter Rediffmail ID']")).sendKeys("john123");
		
		driver.findElement(By.id("newpasswd")).sendKeys("john12345");
		
		driver.findElement(By.id("newpasswd1")).sendKeys("john12345");
		
		Select dob_date = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		dob_date.selectByIndex(5);
		
		Select dob_year = new Select(driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]")));
		//dob_year.selectByIndex(2002);
		dob_year.selectByValue("2000");
		
		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		dob_month.selectByIndex(3); //MAR
		dob_month.selectByValue("05"); //MAY
		dob_month.selectByVisibleText("JUN");
		//dob_month.deselectAll();
		
		driver.findElement(By.xpath("//label[text()='Female']"));
		
		Select live_in = new Select(driver.findElement(By.id("country")));
		live_in.selectByVisibleText("United States");
		//live_in.selectByValue("222");
		
		driver.findElement(By.cssSelector("[placeholder='Enter recovery email']")).sendKeys("john123@gmail.com");
		
		driver.findElement(By.id("mobno")).sendKeys("4567890909");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(Duration.ofSeconds(2));
		
        Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//driver.findElement(By.id("Register")).click();
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='Select a Security Question']")), "Select a Security Question"));
		
		Select hintq = new Select(driver.findElement(By.xpath("//select[contains(@name,\"hintq\")]")));
		hintq.selectByVisibleText("What is the name of your first school?");
		
		CaptureScreenshot.testresults(driver, "create_new_account_functionality");
		
	}

}		
		
		
		
		
		

