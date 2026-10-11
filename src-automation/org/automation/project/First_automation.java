package org.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class First_automation 

{
	
    @Test
	public void login_functionality() 
	{
    	//WebDriver driver = new ChromeDriver(); //launch the chrome browser
    	
    	//ChromeOptions co = new ChromeOptions();
    	//co.addArguments("--incognito");
    	//WebDriver driver = new ChromeDriver(co); // to launch incognito windows
    	
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().window().maximize();
		//WebElement username = driver.findElement(By.id("login1"));
		//username.sendKeys("john.seo");
		//driver.findElement(By.name("passwd")).sendKeys("pass1234");
		//driver.findElement(By.className("signin-btn")).click();
		
		
    	//driver.get("https://www.amazon.com/");
		//WebElement search_amazon = driver.findElement(By.id("twotabsearchtextbox"));
		//search_amazon.sendKeys("nike shoes men");
		
		
    	//WebDriver driver = new EdgeDriver(); //launch the edge browser
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.close();
		
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		//driver.navigate().to("https://www.saucedemo.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.close();   // will close one active window/tab
		//driver.quit(); //will close all the tab/window provided those tabs/windows open by automated software
		
    	
    	//Homework
         WebDriver driver = new EdgeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
         
         driver.navigate().to("https://www.saucedemo.com/");
         WebElement username = driver.findElement(By.id("user-name"));
         username.sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click();
         driver.quit();
         
         
         }

}
