package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/30");
		driver.findElement(By.id("compare")).click();
		 Set<String> allwindowIDs = driver.getWindowHandles();
		 for(String id:allwindowIDs)
		 {
			 driver.switchTo().window(id);
			 String actURL = driver.getCurrentUrl();
			 if(actURL.contains("flipkart"));
			 {
				 break;
			 }
		 }
		driver.close();
	}

}
