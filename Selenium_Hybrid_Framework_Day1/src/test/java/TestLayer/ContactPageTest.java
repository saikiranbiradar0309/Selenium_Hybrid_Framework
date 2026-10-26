package TestLayer;

import org.testng.annotations.Test;


import PagesLayer.ContactsPage;

public class ContactPageTest {
	
	
	@Test(priority = 1)
	public void validateCreateContactFunctionality() throws InterruptedException 
	{
		
		Thread.sleep(5000);
		
		
		ContactsPage contactPage = new ContactsPage();
		
		
		//contactPage.createContact("Sai", "Biradar", "SDET", "Testing");
		
		contactPage.createContact("Sneha", "Karajagi");
		
	}
}
