package PagesLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseTest;

public class ContactsPage extends BaseTest {
	
	
	//Object Repository
	@FindBy(xpath="//span[text()='Contacts']")
	private WebElement contactsLink;
	
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createContactLink;
	
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;
	
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	
	
	@FindBy(xpath="//input[@id='position']")
	private WebElement position;
	
	
	@FindBy(xpath="//input[@id='department']")
	private WebElement department;
	
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	
	
	// Initialize Object Repository
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Create Associated Methods
	public void createContact(String fname, String lname)
	{
		this.contactsLink.click();
		this.createContactLink.click();
		this.firstName.sendKeys(fname);
		this.lastName.sendKeys(lname);
		this.saveButton.click();
	}
	
	
	public void createContact(String fname, String lname, String position, String dept)
	{
		this.contactsLink.click();
		this.createContactLink.click();
		this.firstName.sendKeys(fname);
		this.lastName.sendKeys(lname);
		this.position.sendKeys(position);
		this.department.sendKeys(dept);
		this.saveButton.click();
	}
	
}
