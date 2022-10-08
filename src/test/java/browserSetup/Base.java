package browserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openChromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\geckodriver.exe");
		WebDriver driver = new OperaDriver();
		return driver;
	}

}
