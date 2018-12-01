package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	static WebDriver driver;
	public static void main(String[] args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://html.com/input-type-file/");
			
			driver.findElement(By.className("search-field")).sendKeys("Somethng");
           WebElement locator=driver.findElement(By.className("search-submit"));
           explicitly(driver,locator,10);
          // locator.click();

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void explicitly(WebDriver driver,WebElement locator,int timeout) {
		
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		;
	}
}
