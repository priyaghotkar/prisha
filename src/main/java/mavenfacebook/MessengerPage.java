package mavenfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.utility;

public class MessengerPage extends utility {
	
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailAddrorPhno;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	private WebElement logIn;
	
	@FindBy(xpath ="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy(xpath ="//a[text()='Features']")
	private WebElement features;
	
	@FindBy(xpath ="//a[text()='Desktop app']")
	private WebElement desktopApp;
	
	public MessengerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
//		act = new Actions(driver);
//		wait = new WebDriverWait(driver,20);
		
	}
//	public void sendkeys()
//	{
//		emailAddrorPhno.sendKeys("Priya");
//		passWord.sendKeys("12345");
//		logIn.click();
//	}
	public void clickOnRooms()
	{
		//wait.until(ExpectedConditions.visibilityOf(rooms));
		//rooms.click();
		Actions act = new Actions(driver);
		act.moveToElement(rooms).click().build().perform();	
	}
	public void clickOnfeatures()
	{
		features.click();
		//act.moveToElement(features).click().perform();
	}
	public void clickOndesktopapp()
	{
		desktopApp.click();
	}

}
