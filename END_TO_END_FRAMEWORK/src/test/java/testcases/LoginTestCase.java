package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.Login;
import pageobjects.QA_Accademy_Login_Page;

public class LoginTestCase extends Base 
{
	
	WebDriver driver;
	@Test
	public void facebooklogintest() throws IOException
	{
		driver=initializeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		Login lo=new Login(driver);
		lo.Username().sendKeys("9618984180");
		lo.Password().sendKeys("Eswar.2084");
		lo.LoginButton().click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
	
	@Test()
	public void qaAccademyLogin() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		QA_Accademy_Login_Page qalogin=new QA_Accademy_Login_Page(driver);
		qalogin.signinLink().click();
		qalogin.UserName().sendKeys("asdfghjk");
		qalogin.Password().sendKeys("asdfghjkl");
		qalogin.LoginButton().click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
	@Test(dataProvider="logintest Data")
	public void testfordataprovider(String username, String password)
	{
		
		System.out.println(username+"  "+password);
	}
	
	@DataProvider(name="logintest Data")
	public Object[][] logindata()
	{
		
		Object[][] data= {  {"eswar@gmail.com","eswarreddy"}, {"eswar1@gmail.com","eswarreddy"},{"eswar2@gmail.com","eswarreddy"}};
		return data;
	}
}



