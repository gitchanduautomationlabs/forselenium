package WebDriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndleFileUploadPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("http://html.com/input-type-file/");
		Thread.sleep(5000);
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\user\\Desktop\\upload.html");
		String fileuploadName=driver.findElement(By.id("fileupload")).getText();
		System.out.println("Upload File Name="+fileuploadName);

		if(fileuploadName.contains("upload.html"))
			System.out.println("Upload File Name="+fileuploadName);
		driver.close();

	}

}
