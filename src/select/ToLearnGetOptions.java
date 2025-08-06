package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://x.com/");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select monsel = new Select(month);
		List<WebElement> allOptions = monsel.getOptions();
		System.out.println(allOptions.size());
		for(WebElement l : allOptions)
		{
			System.out.println(l.getText());
		}
	} 
}
