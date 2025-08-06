package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fls=new FileInputStream("./TestData/commondata.properties");
		 Properties prop=new Properties();
		 
		 prop.load(fls);
		 String url = prop.getProperty("url");
		 System.out.println(url);
		 
		 String pass = prop.getProperty("pass");
		 System.out.println(pass);
		 
		 //how to use this in our script?
		 	WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
	}
}

