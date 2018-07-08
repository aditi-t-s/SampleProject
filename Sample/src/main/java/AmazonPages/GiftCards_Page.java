package AmazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtility.AppDriver;

public class GiftCards_Page extends AppDriver{

	public GiftCards_Page() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//*[text()='Gift Cards']")
	public WebElement GiftCards_Link;
	
	@FindBy (xpath = "//img[@alt='Mail']")
	public WebElement Mail_Img;
	
	@FindBy (xpath = "//*[text()='Registry'] ")
	public WebElement Registery_button;
	
	
	public void mailingToCustoer () {
		GiftCards_Link.click();
		Mail_Img.click();
		Registery_button.click();
	}
	

	
	
	
	
}
