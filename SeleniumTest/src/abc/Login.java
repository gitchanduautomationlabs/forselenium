package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

		@Test
		public void a(){
			
			  System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			 // WebDriver dd=new FirefoxDriver();
			  driver.get("http://www.gcrit.com/build3/admin");
			  //Thread.sleep(10000, 1000);
			  driver.manage().window().maximize();
			  String E_Url=driver.getCurrentUrl();
			  String E_Title=driver.getTitle();
			  if(E_Url.contains("http://www.gcrit.com/build3/admin"))
			  { 
				  System.out.println("Test Case:1 Exepected URL Got--Passed");
			  }
			  else
			  {
				  System.out.println("Test Case:1 Exepected URL not Got--Failed");
			  }
		}
	}

