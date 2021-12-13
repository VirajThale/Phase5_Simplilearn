package test;

import org.testng.annotations.Test;

import pages.CheckOutPage;



public class ChekcOutTest extends DriverClass {
	CheckOutPage check= new CheckOutPage();
	
	
	
	@Test
	public void checkout_demo() {
		
		check.go_to_cart();
		check.payment_gateway();
		
	}

}
