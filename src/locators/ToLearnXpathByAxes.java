package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/911ni/Desktop/MovieTable.html");
		String position = driver.findElement(By.xpath("//td[text() = 'KGF']/following-sibling::td[2]")).getText();//to capture the text we use getText
		System.out.println(position);//return type is string becoz here we are using getText to capture the text and to capture text we use string
		
	}

}
