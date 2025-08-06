package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car1 
{
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bugatti.com/");
		Reporter.log("Welcome To Buggati",true);
	}
}
