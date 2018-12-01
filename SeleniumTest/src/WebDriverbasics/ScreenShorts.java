package WebDriverbasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;


import java.io.File;

public class ScreenShorts {

	public static void main(String[] args) {
		
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("http://html.com/input-type-file/");
			

			// Take screenshot and store as a file format
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// now copy the  screenshot to desired location using copyFile //method
			//FileUtils.copyFile(src, new File("C:\\Users\\user\\Desktop\\screenshort.docx"));			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
