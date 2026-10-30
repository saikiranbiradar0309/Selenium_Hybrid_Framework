package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class RegisterPage extends BasePage{

	// POM Design Pattern
	
	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "hone")
	WebElement phone;
	
	@FindBy(name = "userName")
	WebElement email;
	
	@FindBy(name = "address1")
	WebElement address;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	
	@FindBy(name = "country")
	WebElement country;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name = "submit")
	WebElement submit;
	
	
	
	
	// Initialize Object Repository
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Create Associated Methods
	public void enterFirstName(String fname)
	{
		this.firstName.sendKeys(fname);
	}
	
	
	public void enterLastName(String lname)
	{
		this.lastName.sendKeys(lname);
	}
	
	
	public void enterPhone(String phone)
	{
		this.phone.sendKeys(phone);
	}
	
	
	public void enterEmail(String mail)
	{
		this.email.sendKeys(mail);
	}
	
	public void enterAddress(String addr)
	{
		this.address.sendKeys(addr);
	}
	
	public void enterCity(String city)
	{
		this.city.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		this.state.sendKeys(state);
	}
	
	public void enterPostalCode(String postal)
	{
		this.postalCode.sendKeys(postal);
	}
	
	public void enterCountry(String country)
	{
		Select sel = new Select(this.country);
		sel.selectByVisibleText(country);
		
	}
	
	public void enterUsername(String uname)
	{
		this.username.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String confirmPass)
	{
		this.confirmPassword.sendKeys(confirmPass);
	}
	
	public void clickOnSubmit()
	{
		this.submit.click();
	}
}
