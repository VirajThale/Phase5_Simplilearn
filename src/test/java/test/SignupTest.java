package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SignupPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignupTest extends DriverClass  {
	
	
	@Test
	@Parameters({"EmailID","Password","CPassword","First","Last","Age","Address"})
	public void Signup(String CEmailID,String CPassword, String CPassword2, String First,String Last,String Age,String Address) {
		
		SignupPage sign = new SignupPage();
		sign.signup(CEmailID, CPassword, CPassword2, First, Last, Age, Address);
		
	}
	
}