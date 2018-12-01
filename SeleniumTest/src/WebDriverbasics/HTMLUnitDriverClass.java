package WebDriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverClass {

	public static void main(String[] args) {
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			//WebDriver driver=new HtmlUnitDriver();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://html.com/input-type-file/");
			//String getUrl=driver.getCurrentUrl();
			//System.out.println(getUrl);
			
			//Advantages 
			//without lunching the browser can test 
			//very fast --test execution 
			//Ghost driver --headless browser
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
