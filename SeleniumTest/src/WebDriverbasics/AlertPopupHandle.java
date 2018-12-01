package WebDriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) {
		
		try
		{
		System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();		
		String alertMsg=alert.getText();
		System.out.println(alertMsg);
		alert.dismiss();
		driver.findElement(By.id("login1")).sendKeys("hello");;
		//driver.findElement(By.name("proceed")).click();
		//alert.accept();
		if(alertMsg.equals("Please enter a valid user name"))
			System.out.println("Current Error Msg getting..");
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
