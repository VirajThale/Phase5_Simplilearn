package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class DriverClass{
	
	public static WebDriver driver;
	String appURL = "http://localhost:8080/Section7LEP2/login";


@BeforeTest
public void SetUp()

	{
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
	driver.get(appURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
}


@AfterTest
	public void tearDown() {

		driver.quit();
	}

}