package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	public  Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="pass") WebElement password;
	@FindBy(name="login") WebElement loginbutton;
	
	public WebElement Username()
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
