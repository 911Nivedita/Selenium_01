package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/23");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowsIds = driver.getWindowHandles();
		System.out.println(allwindowsIds );
	}
}
