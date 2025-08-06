/*
 launch the browser
navigate to redbus.in
verify welcome page displayed or not.
then capture the source code
print it in console.
*/
package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus"))
		{
			System.out.println("welcome page is displayed");
		}
		else
		{
			System.out.println("welcome page is not displayed");
		}
		
		
		String source = driver.getPageSource();
		System.out.println(source);
	}
}
