package test;


import org.testng.annotations.Test;

import pages.HomePage;


public class HomeTest extends DriverClass {
	HomePage home = new HomePage();

	@Test
	public void add_cart() {
		
		home.cart1();
		home.back_to_cart();
		home.cart2();
		home.back_to_cart();
		home.cart3();
		home.back_to_cart();
	
	}

}
