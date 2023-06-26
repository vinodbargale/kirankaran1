package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Apputils {
	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com";
	
	
	@BeforeMethod
	public static void launchApp()	
	{
		System.setProperty("webdriver.gecko.driver", "F://geckodriver//geckodriver.exe");		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(url);
	}	
	
	@AfterMethod
	public static void closeApp()
	{
		driver.close();
	}

}


