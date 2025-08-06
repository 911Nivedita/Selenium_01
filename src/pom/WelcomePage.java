package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(className = "ico-login")
	private WebElement loginlink;
	
	
	//initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//getters
	public WebElement getRegisterLink() 
	{
		return registerLink;
	}


	public WebElement getLoginlink() {
		return loginlink;
	}
		
}
