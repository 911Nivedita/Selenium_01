package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//to verify whether title in output is same as requirement document or not..           
		if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
		{
			System.out.println("welcome page is displayed");
		}
		else
		{
			System.out.println("welcome page is not displayed");
		}
	}

}
