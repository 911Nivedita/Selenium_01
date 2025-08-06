package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car2 
{
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en#val-ht");
		Reporter.log("Welcome To Lambhorgini",true);
	}
}
