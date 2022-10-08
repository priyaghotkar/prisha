package testFacebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserSetup.Base;
import mavenfacebook.DesktopAppPage;
import mavenfacebook.FeaturesPage;
import mavenfacebook.SignInorSignUP;
import utils.utility;

public class TestNG2 extends Base {
	private WebDriver driver;
	private SignInorSignUP signInorSignUP;
	private FeaturesPage featurespage;
	private DesktopAppPage desktopApp;
	private SoftAssert soft;
	private int TestID;
	
	@Parameters("browser")
	@BeforeTest
	public void LaunchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		driver = openChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			driver = openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void launchBrowser()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.facebook.com/");
        
		signInorSignUP = new SignInorSignUP(driver);
        
		signInorSignUP.clickOnMessenger();
        
		soft = new SoftAssert();
	}
	@Test (priority = 1)
	public void Verify_clickOnFeatureButton()
	{
		TestID = 003;
		featurespage = new FeaturesPage(driver);
		featurespage.clickOnMessenger();
		soft.fail();
		soft.assertAll();
		
	}
	
	@Test (priority = 2)
	public void Verify_clickOnDesktopAppButton()
	{
		TestID = 004;
		desktopApp = new DesktopAppPage(driver);	
		desktopApp.clickOnCookiePolicy();
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			utility.captureScreenshot(driver, TestID);
		}
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void removeObjects()
	{
		signInorSignUP = null;
		featurespage = null;
		desktopApp = null;
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
		driver.close();
		driver = null;
		System.gc();
	}
}
