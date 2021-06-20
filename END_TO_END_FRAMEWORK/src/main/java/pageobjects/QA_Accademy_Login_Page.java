package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QA_Accademy_Login_Page {
	WebDriver driver;
	
	public  QA_Accademy_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Login") WebElement signin;
	@FindBy(name="email") WebElement username;
	@FindBy(name=" password") WebElement password;
	@FindBy(name="commit") WebElement loginbutton;
	
	public WebElement signinLink()
	{
		return signin;
	}
	public WebElement UserName()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement LoginButton()
	{
		return loginbutton;
	}
}
