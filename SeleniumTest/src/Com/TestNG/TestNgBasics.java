package Com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgBasics {
	@BeforeSuite
	public void Set()
	{
		System.out.println("Set The Browser the application..");
		
	}
	@BeforeClass
	public void login()
	{
		System.out.println("login application..");
		
	}
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Lunched Browser..");
		
	}
	
	@Test(groups="title" ,priority=4)
	public void GetTitle()
	{
		System.out.println("Get the Title..");
		
	}
	@Test(groups="title" ,priority=2)
	public void GetCurrentUrl()
	{
		System.out.println("Get the current Url..");
		
	}
	@Test(groups="title" ,priority=3)
	public void gettext()
	{
		System.out.println("Get the current Text..");
		
	}
	@Test(groups="title", priority=1)
	public void loginchecking()
	{
		System.out.println("Get Login or not..");
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closed Browser..");
		
	}
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout The Application..");
		
	}
	@AfterSuite
	public void DeleteAllCookies()
	{
		System.out.println("Delete All Cookies..");
		
	}
}
