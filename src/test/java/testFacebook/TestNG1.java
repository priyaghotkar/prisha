package testFacebook;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetup.Base;
import mavenfacebook.MessengerPage;
	import mavenfacebook.RoomsPage;
	import mavenfacebook.SignInorSignUP;
import utils.utility;

	public class TestNG1 extends Base
	{
		private WebDriver driver ;
		private SignInorSignUP signInorSignUP ;
		private MessengerPage messengerpage ;
		private RoomsPage roomspage ;
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
		public void createPOMObjects() throws IOException
		{
			signInorSignUP = new SignInorSignUP(driver);
			
			messengerpage = new MessengerPage(driver);
			roomspage = new RoomsPage(driver);
		}
		@BeforeMethod
		public void OpenRoomsPage() throws IOException
		{
	        driver.get("https://www.facebook.com/login/");
	        String data1 = utility.getExcelSheetData("MavenUtil", 5 , 0);
			System.out.println(data1);
			signInorSignUP.sendemailAddrorPhno(data1);
	
			String data2 = utility.getExcelSheetData("MavenUtil", 5 , 1);
			signInorSignUP.sendPassword(data2);
	        
//	        signInorSignUP.clickOnMessenger();
			
		//	messengerpage.clickOnRooms();
			
		}
	@Test 
	public void Verify_ReturnToMessenger_button()
		{	
		System.out.println("Test");
//			TestID = 001;
//			roomspage.clickOnReturntoMessenger();
//			String url = driver.getCurrentUrl();
//			boolean result = url.equals("www.facebook");
		//	Assert.assertTrue(result, "Wrong URL");
			
//			if(url.equals("jvnjnbhn"))
//			{
//				System.out.println("fail");
//			}
//			else
//			{
//				System.out.println("pass");
		//	}
			
		}
//		@Test (priority = 2 )
//		public void Verify_VisitToHelpCenter_button()
//		{
//			TestID = 002;
//			roomspage.clickOnvisitourHelpCenter();;
//			String title = driver.getTitle();
//			
//			Assert.assertEquals(title,"Messenger Help ","wrong title");
//			if(title.equals("abcd"))
//			{
//				System.out.println("fail");
//			}
//			else
//			{
//				System.out.println("pass");
//			}
//		}
//		@AfterMethod()
//		public void afterMethod(ITestResult result) throws IOException
//		{
//			if(ITestResult.FAILURE==result.getStatus())
//			{
//				utility.captureScreenshot(driver, TestID);
//			}
//			System.out.println("AfterMethod");
//		}
		@AfterClass()
		public void removeObjects()
		{
			signInorSignUP = null;
//			messengerpage = null;
//			roomspage = null;
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


