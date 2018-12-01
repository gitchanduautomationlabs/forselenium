package WebDriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitClass {

	public static void main(String[] args) {
		// 
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("http://www.half.ebay.com/");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("gh-btn")).click();;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
