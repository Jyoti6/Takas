package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import generic.Base;


public class Home extends Base
{
	@Test
	
	
		public void TestScript1()
		{
			ExtentTest logger=extent.startTest("HomePage");
			HomePage h=PageFactory.initElements(Base.driver, HomePage.class);
			h.homepage();
			logger.log(LogStatus.INFO,"home page");
			extent.endTest(logger);
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			LoginPage l=PageFactory.initElements(Base.driver, LoginPage.class);
			l.loginpage();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
		
	
      }
}
