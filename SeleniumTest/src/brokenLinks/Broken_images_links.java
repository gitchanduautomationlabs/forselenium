package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Broken_images_links {
	WebDriver driver;
	@BeforeClass
	public void lunch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			 driver=new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.get("https://classic.crmpro.com/");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("chandufreecrm");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("chandu@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Test
	public void borkenImages() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> lst=driver.findElements(By.tagName("img"));
		String url="";
		int response=200;String active="ok";
		for(int j=0;j<lst.size();j++)
		{
			try
			{
			url=lst.get(j).getAttribute("href");
			URL url2=new URL(url);
			HttpURLConnection con=(HttpURLConnection) url2.openConnection();
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println("broken link / imsges.."+url);
				continue;
			}
			else
			{
				System.out.println("No broken links"+url);
				continue;
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
	@AfterClass
	public void close(){
	{
			
	driver.close();
	}
	}

}
