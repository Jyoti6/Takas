package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebDriverCommonLib;

public class HomePage
{

//WebDriverCommonLib wlib=new WebDriverCommonLib();

@FindBy(xpath="//a[.='Log In' ]")
public WebElement login;

public void homepage()
{
	
	login.click();
	
}

	
	
}
