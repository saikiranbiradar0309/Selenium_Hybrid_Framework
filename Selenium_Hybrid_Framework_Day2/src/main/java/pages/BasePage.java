package pages;

import org.openqa.selenium.WebDriver;

import utils.DriverManagement;

public class BasePage {
	
	protected static WebDriver driver;
	
	
	public BasePage()
	{
		driver = DriverManagement.getInstance().getDriver();
	}
}
