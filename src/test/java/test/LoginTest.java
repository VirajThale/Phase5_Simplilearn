package test;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest extends DriverClass {
	
	@Test
	@Parameters({"EmailID","Password"})
	public void Signin(String EmailID, String Password) {
		
		LoginPage login =new LoginPage();
		login.signin(EmailID, Password);
		
		
	}

}










