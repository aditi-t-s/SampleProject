package StepDefinitions;

import AmazonPages.GiftCards_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class GiftCards_Steps extends GiftCards_Page{
		
	public GiftCards_Steps() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Given ("^I want to open a browser \"(.*)\"$")
	public void want_open_browser (String browser) throws Throwable{
		openBrowser(browser);
	}
	
	@And ("^I want to launch the application$")
	public void launch_app () throws Throwable{
		navigateURL();
	}
	
	/*@And ("^I want to get mail$")
	public void get_mail() throws Throwable{
		mailingToCustoer();
	}*/
	
	@And ("^I want enter \"(.*)\" as \"(.*)\"$")
	 public void want_enter_value (String xpath, String textValue){
	  enterText(xpath, textValue);
	 }
	 
	 @And ("^I click on button \"(.*)\"$")
	 public void click_button (String xpath){
	  clickButton(xpath);
	 }
	 
	


}
