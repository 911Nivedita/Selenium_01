package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car3 
{
	@Test(groups = "regression")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("Welcome To Mercedes",true);
	}
}
