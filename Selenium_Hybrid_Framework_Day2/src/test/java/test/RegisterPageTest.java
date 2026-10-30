package test;


import org.testng.annotations.Test;

import java.sql.Driver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import base.BaseTest;
import pages.RegisterPage;
import utils.DriverManagement;

public class RegisterPageTest {
	
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browser)
	{
		BaseTest.initialization(browser);
	}
	
	
	@Test
	public void validateRegisterNewUserFunctionality() throws InterruptedException
	{
		RegisterPage registerPage = new RegisterPage();
		registerPage.enterFirstName("Saikiran");
		registerPage.enterLastName("Biradar");
		registerPage.enterPhone("6767676767");
		registerPage.enterEmail("sai@gmail.com");
		registerPage.enterAddress("BTM Layout Bengaluru");
		registerPage.enterCity("Bengaluru");
		registerPage.enterState("Karnataka");
		registerPage.enterPostalCode("560068");
		registerPage.enterCountry("INDIA");
		registerPage.enterUsername("sai@gmail.com");
		registerPage.enterPassword("Sai@123");
		registerPage.enterConfirmPassword("Sai@123");
		
		Thread.sleep(5000);
		
		registerPage.clickOnSubmit();
	}
	
	
	@AfterTest
	public void tearDown()
	{
		DriverManagement.getInstance().getDriver().quit();
	}
}
