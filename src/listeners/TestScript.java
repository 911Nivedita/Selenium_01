package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass
{
	@Test
	public void login()
	{
		/*
		 
		Reporter.log("open browser and enter URL",true);
		Reporter.log("click on login link",true);
		Reporter.log("enter valid ceredentials",true);
		Reporter.log("click on login button",true);
		Assert.assertEquals(true, false,"HomePage is not displayed");//true-false generate fail event, true true will generate success event
		Reporter.log("HomePage is displayed",true);
		
		*/
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo eb Shop", "Home page is not displayed");
		Reporter.log("Home page is displayed", true);
	}
}
