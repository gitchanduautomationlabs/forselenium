package WebDriverbasics;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigPropertiesFile {

	public static void main(String[] args) {
		
		try
		{
			
			
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("G:\\Selenium\\Selenium Practice\\SeleniumTest\\src\\WebDriverbasics\\config.properties");
			prop.load(fis);
			String Name=prop.getProperty("name"),
					Password=prop.getProperty("password"),
					Url=prop.getProperty("url"),
					browser=prop.getProperty("browser");
			
			System.out.println(Name+" "+Password + " "+Url +" "+browser);
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();		
				driver.get(Url);
			}
			else if(browser.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", "G:/Selenium/internetexplorerdriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();		
				driver.get(Url);
			}
			else
			{
				
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
