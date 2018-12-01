package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecutorConcept {

	public static void main(String[] args) {

		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://www.freecrm.com");
			driver.findElement(By.name("username")).sendKeys("naveenk");
			driver.findElement(By.name("password")).sendKeys("test@123");
			//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
			WebElement element=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String color="red";
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", driver.findElement(By.name("username")));
			js.executeScript("arguments[0].style.border='3px solid green'", driver.findElement(By.name("password")));
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
