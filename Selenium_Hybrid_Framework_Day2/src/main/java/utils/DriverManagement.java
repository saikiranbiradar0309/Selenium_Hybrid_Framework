package utils;

import org.openqa.selenium.WebDriver;

public class DriverManagement {
	
	
	// It will support for parallel test execution
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	
	// Singleton design pattern
	private DriverManagement()
	{
		
	}
	
	
	public static DriverManagement getInstance()
	{
		return new DriverManagement();
	}
	
	
	public static void setDriver(WebDriver driverName)
	{
		threadLocal.set(driverName);
	}
	
	
	public WebDriver getDriver()
	{
		return threadLocal.get();
	}
}
