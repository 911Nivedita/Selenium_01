package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Assignment34BaseClass 
{
	public WebDriver driver;//becoz if we declare inside a method it will become local variable and it cant be accessed..
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
