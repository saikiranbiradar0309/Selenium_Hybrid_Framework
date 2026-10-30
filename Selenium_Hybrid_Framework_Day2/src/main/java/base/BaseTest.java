package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;


import utils.DriverFactory;
import utils.DriverManagement;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void initialization(String browser)
	{
		
		DriverFactory.setDriver(browser);
		
		WebDriver driver = DriverManagement.getInstance().getDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
}	
