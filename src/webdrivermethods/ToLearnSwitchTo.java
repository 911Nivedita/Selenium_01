package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/23");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();//capturing ids
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);//switching to each windows
			Thread.sleep(1000);
			String url = driver.getCurrentUrl();//capturing each window url
			System.out.println(url);
			if(url.equals("https://www.amazon.in/"))//closing only amazon url //(driver.getCurrentUrl().contains("amazon")) -----contains compare the given url and close that url..
			{
						driver.close();
		    }
			if(url.equals("https://www.flipkart.com/"))//here else if also we can use
			{
				driver.manage().window().maximize();
			}
			
			/*
			 if(!driver.getCurrentUrl().contains("flipkart")) // for industry purpose
					{
						break;
					}
			
		}
		driver.manage().window().maximize(); 
		*/
		
	}
	}
}
