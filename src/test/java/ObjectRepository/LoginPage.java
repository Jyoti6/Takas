package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
 @FindBy(xpath="//input[@id='email']")
 private WebElement username;
 
 @FindBy(xpath="//input[@id='pass']")
 private WebElement password;
   
@FindBy(xpath="//span[.='Login']")
public WebElement login;
 
 public void loginpage()
 {
	 username.sendKeys("risingstar61190@gmail.com");
	 password.sendKeys("takaslk");
	 login.click();
	 
 }
}
