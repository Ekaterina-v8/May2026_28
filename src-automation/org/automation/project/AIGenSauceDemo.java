package org.automation.project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AIGenSauceDemo 
{


	    @Test
	    public void saucedemo_loginpage() {
	    	
	    	// Launch Chrome Browser
	    	WebDriver driver = new ChromeDriver();
	        
	        
	        driver.manage().window().maximize();
	        
	        // Replace with your actual practice application login URL
	        driver.get("https://www.saucedemo.com/"); 
	        
	        driver.manage().window().maximize();
	        
	        // 1. Enter Username
	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");
	        
	        // 2. Enter Password
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");
	        
	        // 3. Click Login Button
	        WebElement loginBtn =driver.findElement(By.id("login-button"));
	        loginBtn.click();
	        
	        List<WebElement> productlist = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
	        System.out.println(productlist.size());
	        //productlist.get(1).click();
	        System.out.println(productlist.get(1).getText()); //second product
	        
	        for(WebElement list: productlist)
	        {
	        	System.out.println(list.getText());
	        }
	        
	        
	          
	        
	        // Clean up session
	        driver.quit();
	    }
	}

