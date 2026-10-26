package TestLayer;


import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import BaseLayer.BaseTest;
import PagesLayer.LoginPage;

public class LoginPageTest {
	
	
	@BeforeTest
	public void setup()
	{
		// It will initialize the blank browser from BaseTest
		BaseTest.initialization();
	}
	
	
	@Test
	public void validateLoginFunctionality()
	{

		LoginPage loginPage = new LoginPage();
		
		loginPage.enterUsername("prafulp1010@gmail.com");
		loginPage.enterPassword("Pr@ful0812");
		loginPage.clickOnLoginButton();
		
		
	}
	
	
	/*
	@AfterTest
	public void tearDown()
	{
		BaseTest.driver.quit();
	}
	
	*/
}
