package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;

import test.DriverClass;

public class LoginPage extends DriverClass {
	
	
	public void signin(String EmailID, String Password) 
	{
		//Login Process
		
		WebElement email_id = driver.findElement(By.xpath("//input[@name='email_id']"));
		email_id.sendKeys(EmailID);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys(Password);
		WebElement button = driver.findElement(By.xpath("//button[text()='Login']"));
		button.click();
		WebElement title = driver.findElement(By.xpath("//h3[text()]"));
		String actual_title = title.getText();
		String expected_title = "SPORTY SHOES - DASHBOARD";
		AssertJUnit.assertEquals(actual_title, expected_title);

	}
	
}
