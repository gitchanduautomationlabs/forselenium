package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {

	public static void main(String[] args) {
	
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://jqueryui.com/droppable");
			driver.switchTo().frame(0);
			WebElement sourcedrop=driver.findElement(By.id("draggable"));
			WebElement targetdrop=driver.findElement(By.id("droppable"));
			Actions actions =new Actions(driver);
			//actions.clickAndHold(sourcedrop).moveToElement(targetdrop).release().build().perform();
            actions.dragAndDrop(sourcedrop, targetdrop).release().build().perform();
			Thread.sleep(3000);
			driver.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
