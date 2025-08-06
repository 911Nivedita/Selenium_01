package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelFile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fls = new FileInputStream("./TestData/testscript-data.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pswd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		int price = (int)wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(url);
		System.out.println(email);
		System.out.println(pswd);
		System.out.println(price);
		System.out.println(status);
		System.out.println(date);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
}