package mavenfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;

public class RoomsPage extends utility {

	@FindBy(xpath = "//a[text()=' Return to messenger.com ']")
	private WebElement returnTomessenger;
	
	@FindBy(xpath = "//a[text()=' Visit our help center ']")
	private WebElement visitOurhelpcenter;
	
	public RoomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnReturntoMessenger()
	{
		returnTomessenger.click();
	}
	public void clickOnvisitourHelpCenter()
	{
		visitOurhelpcenter.click();
	}
}
