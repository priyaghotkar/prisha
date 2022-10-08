package mavenfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;

public class SignInorSignUP extends utility {
	
	//variable declaration
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement emailAddrorPhno;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passWord;
	
//	@FindBy(xpath = "(//input[@type='text'])[1]")
//	private WebElement firstName;
//	
//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	private WebElement surname;
//	
//	@FindBy(xpath = "(//input[@type='text'])[3]")
//	private WebElement emailOrPh;
//	
//	@FindBy(xpath = "//input[@type='password']")
//	private WebElement newPassword;
//	
//	@FindBy(xpath = "(//button[@type='submit'])[1]")
//	private WebElement signUp;
//	
	@FindBy(xpath = "//a[text()='Messenger']")
	private WebElement messenger;
	
	//variable Initialization
	public SignInorSignUP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendemailAddrorPhno(String user)
	{
		emailAddrorPhno.sendKeys(user);
	}
	
	public void sendPassword(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	
	//variable use or WebElements action
	
//	public void sendfirstName()
//	{
//		firstName.sendKeys("Priya");
//	}
//	public void sendsurname()
//	{
//		firstName.sendKeys("Ghotkar");
//	}
//	public void sendemailOrPh()
//	{
//		emailOrPh.sendKeys("priyaghotkar@gmail.com");
//	}
//	public void sendnewPassword()
//	{
//		newPassword.sendKeys("12345");
//	}
//	public void clickOnSignUp()
//	{
//		signUp.click();
//	}
	public void clickOnMessenger()
	{
		messenger.click();
	}
}