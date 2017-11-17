package generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;


public class Base implements Constant
{
	public static WebDriver driver;
	public static ExtentReports extent;
	WebDriverCommonLib l=new WebDriverCommonLib();
	
	@BeforeSuite
	   
	public static void configBeforeSuit()
	{
		extent=new ExtentReports("./test-output/advancedreport.html");
		extent.loadConfig(new File("./Resource/extend-config.xml"));
	}
	
	@ BeforeTest
	 public static void BeforeTest()
	 {
		
	 }
	
	@ BeforeClass
	
	  public static void BeforeClass()
	{
		Reporter.log("QuitBrowser",true);
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "/home/tyss/chromedriver");
	    driver=new ChromeDriver();
		}
	    else if (browser.equals("firefox"))
	    {
	    	driver=new FirefoxDriver();
	    }
		driver.get(URL);
		}
		

	 @AfterClass
	 
	    public void configAfterClas()
	    {
	    	Reporter.log("QuitBrowser",true);
	    	driver.quit();
	    }
	    
	    
	@ BeforeMethod
	
	 public static void BeforeMethod()
	 {
		Reporter.log("Login",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	 }
	
	@AfterMethod
	public static void AfterMethod()
	{
	}
	
	 @AfterClass
	    public void configAfterClass()
	    {
	    	Reporter.log("QuitBrowser",true);
	    	driver.quit();
	    }
	 
	 @ AfterTest
	 		public static void AfterTest()
	 	{
		 
	 	}
	 
    @ AfterSuite
    
    public void configAfterSuit()
    {
    	extent.flush();
    	extent.close();
    }

   
    
    
    
    
}

