package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionScript 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		StaleElementExceptionExample se = new StaleElementExceptionExample(driver);
		se.getSearchTextField().sendKeys("mobiles",Keys.ENTER);
		se.getSearchTextField().sendKeys("Shoes");
	}
}
