package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIFRAME 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
		WebElement dreamFrame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(dreamFrame);
		
		
		driver.findElement(By.id("regEmail")).sendKeys("7858923268");
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
	}
}
