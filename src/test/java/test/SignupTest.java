package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SignupPage;

public class SignupTest extends DriverClass  {
	
	
	@Test
	@Parameters({"EmailID","Password","CPassword","First","Last","Age","Address"})
	public void Signup(String EmailID,String Password, String CPassword, String First,String Last,String Age,String Address) {
		
		SignupPage sign = new SignupPage();
		sign.signup(EmailID, Password, CPassword, First, Last, Age, Address);
		
	}
	
}