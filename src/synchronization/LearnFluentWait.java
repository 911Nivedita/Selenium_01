package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LearnFluentWait 
{
	public static void main(String[] args) 
	{//earlier we are checking 0.5 sec now 0.2 sec
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/35");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkbtn = driver.findElement(By.id("Check"));
		
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.pollingEvery(Duration.ofMillis(200));
		fwait.until(ExpectedConditions.elementToBeClickable(checkbtn));
		checkbtn.click();
	}
}
