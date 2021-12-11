package test;

import org.testng.annotations.Test;

import pages.CheckOutPage;


@Test
public class ChekcOutTest extends DriverClass {
	CheckOutPage check= new CheckOutPage();
	
	public void checkout_demo() {
		
		check.go_to_cart();
		
	}

}
