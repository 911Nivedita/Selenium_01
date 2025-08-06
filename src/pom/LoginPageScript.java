package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageScript 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage lp = new LoginPage(driver);
		lp.getEmailtextbox().sendKeys("911nivedita@gmail.com");
		lp.getPasswordtextbox().sendKeys("Nivedita@123");
		lp.getLogginbutton().click();
	}

}
//input[@value='Add To Cart']
//wp.getAddToCartButtons.get(0).click()----------------->we use get method of list
//verify user is able to register to sandbox.skillrory.com