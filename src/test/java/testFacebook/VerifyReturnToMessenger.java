package testFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenfacebook.MessengerPage;
import mavenfacebook.RoomsPage;
import mavenfacebook.SignInorSignUP;

public class VerifyReturnToMessenger {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		SignInorSignUP signInorSignUP = new SignInorSignUP(driver);
		signInorSignUP.clickOnMessenger();
		Thread.sleep(3000);
		MessengerPage messengerpage = new MessengerPage(driver);
		messengerpage.clickOnRooms();
//		messengerpage.clickOnfeatures();
//		messengerpage.clickOndesktopapp();
		
		RoomsPage roomsPage = new RoomsPage(driver);
		roomsPage.clickOnReturntoMessenger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	
	}
	
}
