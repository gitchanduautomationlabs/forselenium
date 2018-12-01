package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	
	public static void main(String[] args) throws InterruptedException {
		try
		{
		System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://spicejet.com/");
		Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		Thread.sleep(2000);
		//action.moveToElement(driver.findElement(By.linkText("MENU"))).
		action.moveToElement(driver.findElement(By.partialLinkText("Travel Info"))).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Tariffs")).click();
		//driver.findElement(By.linkText("Travel Info")).click();
      
		//action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	

}
