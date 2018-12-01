package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
  if(E_Title.equals("GCR Shop"))
  { 
	  System.out.println("Test Case:2 Exepected Title Got--Passed");
  }
  else
  {
	  System.out.println("Test Case:2 Exepected Title not Got--Failed");
  }
 
 
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin@123");
	  driver.findElement(By.className("ui-button-text")).click();
 
  if(driver.getCurrentUrl().contains("gcrit.com/build3/admin/index.php"))
  { 
	  System.out.println("Test Case:3 Exepected URL Got After Login--passed");
  }
  else
  {
	  System.out.println("Test Case:3 Exepected URL not Got after Login--Failed");
  }
  /*Thread.sleep(60000);
  driver.findElement(By.name("username")).sendKeys("admin");
  driver.findElement(By.name("password")).sendKeys("admin@123");
  driver.findElement(By.className("ui-button-text")).click();
  
  if(E_Url.contains("http://www.gcrit.com/build3/admin/login.php"))
  { 
	  System.out.println("Test Case:4 Exepected URL Got After Login--Failed");
  }
  else
  {
	  System.out.println("Test Case:4 Exepected URL not Got if Sessin Blocked for 5 min for  Login--Passed");
  }
  Thread.sleep(180000);

  driver.findElement(By.name("username")).clear();
  driver.findElement(By.name("password")).clear();
  driver.findElement(By.name("username")).sendKeys("admin");
  driver.findElement(By.name("password")).sendKeys("admin@123");
  driver.findElement(By.className("ui-button-text")).click();
  if(E_Url.contains("http://www.gcrit.com/build3/admin/index.php"))
  { 
	  System.out.println("Test Case:4 Exepected URL Got After Login--Failed");
  }
  else
  {
	  System.out.println("Test Case:4 Exepected URL not Got if Sessin Blocked for 5 min for  Login--Passed");
  }
  Thread.sleep(60000);
  driver.findElement(By.name("username")).clear();
  driver.findElement(By.name("password")).clear();
  driver.findElement(By.name("username")).sendKeys("admin");
  driver.findElement(By.name("password")).sendKeys("admin@123");
  driver.findElement(By.className("ui-button-text")).click();
  if(E_Url.contains("http://www.gcrit.com/build3/admin/index.php"))
  { 
	  System.out.println("Test Case:4 Exepected URL Got After Login if session released after 5 Min--Passed");
  }
  else
  {
	  System.out.println("Test Case:4 Exepected URL not Got if Sessin Blocked for 5 min for  Login--Failed");
  }*/
  //Thread.sleep(300000);
  
 driver.close();
  
	}
}
