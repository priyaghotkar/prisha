package mavenfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;

public class DesktopAppPage extends utility {
	
	@FindBy(xpath = "//a[text()='Cookie Policy']")
	private WebElement cookiePolicy;
	
	public DesktopAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCookiePolicy()
	{
		cookiePolicy.click();
	}
	

}
