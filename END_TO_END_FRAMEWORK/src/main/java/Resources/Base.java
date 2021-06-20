package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\END_TO_END_FRAMEWORK\\src\\main\\java\\Resources\\data.properties");
		prop.load(file);
		String Browsername=prop.getProperty("browser");
		
		if(Browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\java\\Selenium\\CHROME DRIVER\\chromedriver.exe");
			driver=new ChromeDriver();
						
		}
		else if(Browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\java\\Selenium\\FIREFOX DRIVER\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		return driver;
	}
}
