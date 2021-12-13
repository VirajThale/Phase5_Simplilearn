package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.DriverClass;

public class PaymentPage extends DriverClass {
	
	

	public void completepurchase() {
		
		WebElement purchase = driver.findElement(By.xpath("//a[@href='completepurchase']"));
		purchase.click();
		
		WebElement title = driver.findElement(By.xpath("//a[@href='memberpurchases']"));
		String actual = title.getText();
		System.out.println(actual);
		String expected ="Your Orders";
		Assert.assertEquals(actual, expected);
		

	}
	
	
	

}
