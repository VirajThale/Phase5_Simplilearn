package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.DriverClass;
public class SignupPage extends DriverClass {

	public void signup(String CEmailID,String CPassword, String CPassword2, String First,String Last,String Age,String Address) 
	{
		
		WebElement cemail = driver.findElement(By.xpath("//input[@name='email_id']"));
		cemail.sendKeys(CEmailID);
		WebElement cpwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		cpwd.sendKeys(CPassword);
		WebElement cpwd2 = driver.findElement(By.xpath("//input[@name='pwd2']"));
		cpwd2.sendKeys(CPassword2);
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys(First);
		WebElement lname = driver.findElement(By.xpath("//input[@name='lname']"));
		fname.sendKeys(Last);
		
		WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
		age.sendKeys(Age);
		
		WebElement address = driver.findElement(By.xpath("//input[@name='age']"));
		address.sendKeys(Address);
		
		
		WebElement signupB = driver.findElement(By.xpath("//button[text()='Signup']"));
		signupB.click();
		}
	
}
