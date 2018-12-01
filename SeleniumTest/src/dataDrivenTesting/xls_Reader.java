package dataDrivenTesting;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class xls_Reader {

	public static void Main(String[] args) throws InvalidFormatException, IOException
	{
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 driver.get("https://www.google.com");

 File src=new File ("C:\\Users\\user\\Desktop\\Login.xlsx");
	FileInputStream fstream=new FileInputStream(src);	
	XSSFWorkbook workbook=new XSSFWorkbook(src);
	XSSFSheet sheet=workbook.getSheetAt(0);
	String val=sheet.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(val);
	
	  driver.findElement(By.id("lst-ib")).sendKeys(val);

	}

}
