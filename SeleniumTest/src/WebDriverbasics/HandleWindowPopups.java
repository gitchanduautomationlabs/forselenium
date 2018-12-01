package WebDriverbasics;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopups {

	public static void main(String[] args) {
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://popuptest.com/goodpopups.html");
			driver.findElement(By.linkText("Good PopUp #1")).click();
		    Set<String>s=driver.getWindowHandles();
		    Iterator<String> it=s.iterator();
		    String ParerntWindow=it.next();
		    System.out .println("Parernt window="+ParerntWindow);
		    String ChildWindow=it.next();
		    System.out .println("Child window="+ChildWindow);
		    driver.switchTo().window(ChildWindow);
		    String childUrl=driver.getCurrentUrl();
		    System.out.println(childUrl);
		    driver.close();
		    driver.switchTo().window(ParerntWindow);
		    System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.linkText("Good PopUp #2")).click();
		    System.out.println(driver.getCurrentUrl());
		    
		    Set<String> handles=driver.getWindowHandles();
		    Iterator<String> it1= handles.iterator();
		    String ParentWindow1=it1.next();
		    System.out .println("Parernt window1="+ParerntWindow);
		    String ChildWindow1=it1.next();
		    System.out .println("Child window1="+ChildWindow1);
		    driver.switchTo().window(ChildWindow1);
		    System.out.println(driver.getCurrentUrl());
		    driver.close();

		    
		    driver.switchTo().window(ParentWindow1);
		    driver.close();
		    

		    
		    

		    
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
