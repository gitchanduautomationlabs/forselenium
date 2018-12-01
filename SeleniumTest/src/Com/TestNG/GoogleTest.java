package Com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void LaunchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="gmail")
	public void GetTitle()
	{
		String getTitle=driver.getTitle();
		System.out.println("Title="+getTitle);
	}@Test(priority=2,groups="gmail")
	public void GetCurrentUrl()
	{
		String getCurrentUrl=driver.getCurrentUrl();
		System.out.println("Url="+getCurrentUrl);
	}
	@Test(priority=3,groups="gmail")
	public void ClickOnGmail()
	{
		driver.findElement(By.linkText("Gmail")).click();
		GetCurrentUrl();
		GetTitle();
	}
	@Test(priority=4,groups="gmail")
	public void backtoMainPage()
	{
		driver.navigate().back();
	}
	@Test(priority=5,groups="gmail")
	public void Search()
	{
		//new WebDriverWait(driver,10).ignoring(StaleElementReferenceException.class).
		//until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//input[@id='lst-ib']"))));
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("gfgdfgfdgfdgfd");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}

	@AfterMethod
	public void BeforeCloseTheBrowser()
	{
		//driver.navigate().back();
		driver.quit();
	}
	
	@AfterClass
	public void CloseTheBrowser()
	{
		//driver.navigate().back();
		//driver.quit();
	}
	
}
