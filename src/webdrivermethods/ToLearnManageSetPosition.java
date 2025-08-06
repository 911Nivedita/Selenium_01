package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageSetPosition 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/ ");
		
		Point position = driver.manage().window().getPosition();
		driver.manage().window().setPosition(new Point(350, 400));
	}
}
