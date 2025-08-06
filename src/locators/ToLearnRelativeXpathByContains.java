package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnRelativeXpathByContains 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("iphone");
		
		//driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//summary[contains(text(),' Can I track the location of my')]")).click();
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[contains(@name,\"addToCart\")]")).click();
	}
}
