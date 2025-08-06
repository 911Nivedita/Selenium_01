package assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment34TestScript2 extends Assignment34BaseClass
{
	@Test
	public void clickonComputers()
	{
		driver.findElement(By.partialLinkText("Computers")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computers page is not displayed");
	}
}
