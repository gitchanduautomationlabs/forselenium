package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_custamized {

	public static void main(String[] args) {
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://google.com/");
			driver.findElement(By.id("lst-ib")).sendKeys("Hello");
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Hello123");
			//driver.findElement(By.name("//input[@name='lst-ib']")).sendKeys("Hello123");
			//driver.findElement(By.xpath("//input[contains(@name,'')"));
			//driver.findElement(By.xpath("//input[starts-width(@id,test_"));
			//driver.findElement(By.xpath("//input[ends-width(@name,'_test_t')"));
			
			//for links
			driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
			
			driver.close();
			//Absolute x-path not recommended bcz if remove any tag/element then u have to change x-path
			//performance issue compare to relative x-path
			//not reliable
			

			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
