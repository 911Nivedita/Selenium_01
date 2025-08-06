package assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment34TestScript extends Assignment34BaseClass
{
	@Test
	public void clickonBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not displayed");
	}
}
