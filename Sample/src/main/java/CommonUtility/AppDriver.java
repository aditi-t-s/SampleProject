package CommonUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDriver {
	public static Properties ObjectXpaths;
	public static WebDriver driver;
	
	public AppDriver() throws Throwable{
		try {
	    //FileInputStream highway = new FileInputStream (new File ("C:\\Users\\Aditi\\Documents\\workspace\\Automation\\src\\ConfigData\\ObjectRepo.properties"));
	     FileInputStream highway = new FileInputStream (new File ("C:\\Users\\Aditi\\Documents\\workspace\\Automation\\src\\ConfigData\\ObjectRepo.properties"));
		 ObjectXpaths = new Properties(); 
	     ObjectXpaths.load(highway);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openBrowser(String browser){
		   try {
			   if(browser.equalsIgnoreCase("chrome")) {
				   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Documents\\workspace\\Automation\\chromedriver.exe");
				   driver = new ChromeDriver();
			   }
			   else if (browser.equalsIgnoreCase("IE")) {
				   System.setProperty("webdriver.ie.driver", "");
				   driver = new ChromeDriver();
			   }
			   else if (browser.equalsIgnoreCase("geckodriver")) {
				   System.setProperty("webdriver.geckodriver.driver", "");
				   driver = new ChromeDriver();
			   }
			   driver.manage().window().maximize();   
			   System.out.println("User is able to open a" + browser +" broswer");
			    
			   
		   }catch (Exception e) {
			   e.printStackTrace();
			   System.out.println("User is unable to open a " + browser + " browser");
			   
			   
		   }
	}
		
		public static void navigateURL() { 
			try{
			driver.get("http://www.amazon.com/");
			System.out.println("User is able to launch the application");
			   
			}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is unable to launch the application");
			   
			}
		}

	    public static void enterText(String objectXpath,String textValue) {  
	    	try {
	    	driver.findElement(By.xpath(ObjectXpaths.getProperty(objectXpath))).sendKeys(textValue);
	    	System.out.println("User has entered " + textValue + " to the text box");
			   
	    	}catch (Exception e){
	    		e.printStackTrace();
	    		System.out.println("User is not able to enter " + textValue + " to the text box");
	    		   
	    	}
	    }
	       	
	    public static void clickButton(String objectXpath) {
	    	try {
	    	driver.findElement(By.xpath(ObjectXpaths.getProperty(objectXpath))).click();
	    	System.out.println("User is able to click the button");
			   
	    	}catch (Exception e){
	    		e.printStackTrace();
	    		System.out.println("User is unable to click the button");
	    		   
	    	}
	    }
	   
	      public static void getTextValue(String objectXpath) {
	    	  try {
	    		  WebElement element = driver.findElement(By.xpath(ObjectXpaths.getProperty(objectXpath)));
	    		  String textValue = element.getText();
	    		  
	    	  
	    	    	
	    	    	}catch (Exception e){
	    	    		e.printStackTrace();
	    	    		
	    	    	}

	      }
	    
	     public static void  DispDropDown(String objectXpath, String textvalue){
	    	try{

	    		//System.out.println("user is able to click Departments"); 
	    	WebElement ele = driver.findElement(By.xpath(ObjectXpaths.getProperty(objectXpath)));
	    	Select select = new Select (ele);
	    	select.selectByVisibleText(textvalue);
	    		
	    	/*String a;
	    	List<WebElement> ele = driver.findElements(By.xpath(ObjectXpaths.getProperty(objectXpath)));
	    	for (WebElement we : ele){
	    	a = we.getText();
	    	System.out.println(a);}*/

	    	
	    	}catch (Exception e){
	    	e.printStackTrace();
	    	

	    	}
	     }



}
