package PagesLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseTest;

public class LoginPage extends BaseTest{
	
	// Locate Object Repository using Page Object Design pattern with Page Factory
	
	@FindBy(id="email")
	WebElement username;
	
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	
	
	// Initialize Object Repository
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Associated Method Without Entering Test Data
	public void enterUsername(String uname)
	{
		this.username.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		this.loginButton.click();
	}
}
