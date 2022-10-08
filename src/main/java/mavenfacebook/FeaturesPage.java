package mavenfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;

public class FeaturesPage extends utility {
	
	@FindBy(xpath = "//img[@alt=\'Messenger\']")
	private WebElement messengersymb;
	
	public FeaturesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMessenger()
	{
		messengersymb.click();
	}
	
	

}
