package testFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenfacebook.MessengerPage;
import mavenfacebook.RoomsPage;
import mavenfacebook.SignInorSignUP;

public class VerifyVisitToHelpCenter {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Onyx\\Desktop\\Sonu Velocity\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		SignInorSignUP signInorSignUP = new SignInorSignUP(driver);
		signInorSignUP.clickOnMessenger();
		
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.clickOnRooms();
		Thread.sleep(3000);	
		RoomsPage roomsPage = new RoomsPage(driver);
		roomsPage.clickOnvisitourHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	
	
	}

}
