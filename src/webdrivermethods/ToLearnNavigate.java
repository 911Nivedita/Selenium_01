package webdrivermethods;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.myntra.com/");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//driver.navigate().to("https://www.myntra.com/");
		driver.navigate().to(new URL("https://www.myntra.com/"));
	}
}
