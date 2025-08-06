package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetAllSelected 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/911ni/Desktop/Month.html");
		WebElement month = driver.findElement(By.id("month"));
		Select monsel = new Select(month);
		monsel.selectByIndex(0);
		monsel.selectByIndex(1);
		monsel.selectByIndex(3);
		
		List<WebElement> allSelctedOptions = monsel.getAllSelectedOptions();
		System.out.println(allSelctedOptions.size());
		
		for(WebElement l : allSelctedOptions)
		{
			System.out.println(l.getText());
		}
		System.out.println(monsel.isMultiple());
	}

}
