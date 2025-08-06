package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		/*
		driver.get("https://demowebshop.tricentis.com/");
		boolean status = driver.findElement(By.xpath("//img@alt='Tricentis Demo Web Shop")).isDisplayed();
		System.out.println(status);
		*/
		
		/*
		driver.get("https://demowebshop.tricentis.com/");
		WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		System.out.println(radiobtn.isSelected());//before clicking on radiobtn
		radiobtn.click();
		System.out.println(radiobtn.isSelected());//after clicking on radiobtn
		*/
		
		driver.get("https://petdiseasealerts.org/alert-subscriptions/#/register");
		boolean status = driver.findElement(By.xpath("//button[text()='Sign Up']")).isEnabled();
		System.out.println(status);
		
		
	}

}
