package test;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.Parameters;



public class LoginTest extends DriverClass {
	
	@Test
	@Parameters({"EmailID","Password"})
	public void Signin(String EmailID, String Password) {
		
		LoginPage login =new LoginPage();
		login.signin(EmailID, Password);
		
		
	}

}










