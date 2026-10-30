package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	// Driver Factory Design Pattern :: We maintain all driver setup in centralized location
	public static void setDriver(String browser)
	{
		WebDriver driver = null;
		
		
		// Driver Factory Design Pattern
				if(browser.equalsIgnoreCase("CHROME"))
				{
					driver = new ChromeDriver();
				}
				
				else if(browser.equalsIgnoreCase("EDGE"))
				{
					driver = new EdgeDriver();
				}
				
				
				else if(browser.equalsIgnoreCase("FIREFOX"))
				{
					driver = new FirefoxDriver();
				}
				
				else if(browser.equalsIgnoreCase("HEADLESS"))
				{
					 ChromeOptions options = new ChromeOptions();
					 options.addArguments("--headless");
					 driver = new ChromeDriver(options);
				}
					
				else if(browser.equalsIgnoreCase("INCOGNITO"))
				{
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--incognito");
					driver = new ChromeDriver(options);
				}
				
				
				else 
				{
					throw new IllegalStateException("Invalid Browser");
				}
				
				
				DriverManagement.getInstance().setDriver(driver);
	}
}
