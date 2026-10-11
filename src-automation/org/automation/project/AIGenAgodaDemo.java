package org.automation.project;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AIGenAgodaDemo 
{
	

	    @Test
	    public void basicFlightSearch() throws Exception {
	        
	        // 1. Open the Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	       
	        // 2. Go to Agoda website
	        driver.get("https://www.agoda.com/");
	        Thread.sleep(5000); // Give the page 5 seconds to load completely
	        
	        // 3. Click on the "Flights" tab
	        driver.findElement(By.id("tab-flight-tab")).click();
	        Thread.sleep(2000); // Wait 2 seconds for the flight fields to show up
	        
	        // 4. Type "New York" into the 'Flying from' field
	        driver.findElement(By.id("flight-origin-search-input")).sendKeys("New York");
	        
	        // 5. Type "London" into the 'Flying to' field
	        driver.findElement(By.id("flight-destination-search-input")).sendKeys("London");
	        
	        // 6. Click the departure field to open the calendar panel
	        driver.findElement(By.id("flight-departure")).click();
	        Thread.sleep(2000); // Wait 2 seconds to let the calendar open
	        
	        // 7. Click the 'SEARCH FLIGHTS' button
	        driver.findElement(By.cssSelector("[data-element-name='flight-search']")).click();
	        
	        // 8. Wait 4 seconds so you can see the result, then close the browser
	        Thread.sleep(4000);
	        driver.quit();
	    }
	}
	
	


	    

	
