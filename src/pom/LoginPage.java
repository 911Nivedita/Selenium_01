package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "Email")
	private WebElement emailtextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath = "//input[@value='Log-in']")
	private WebElement logginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getLogginbutton() {
		return logginbutton;
	}
	
}
