package test;

import org.testng.annotations.Test;

import pages.PaymentPage;

public class PaymentTest extends DriverClass {
	
	
	PaymentPage pay = new PaymentPage();
	
	@Test
	public void payment() {
		
		
		pay.completepurchase();
	}


}
