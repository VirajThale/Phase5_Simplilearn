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
		
		if(actual.contains(expected)) {
			
			WebElement yourorder=driver.findElement(By.xpath("//a[@href='memberpurchases']"));
			yourorder.click();
			
		}
		else {
			System.out.println("Your Test-Failed@PaymentPage");
		}
		
		

	}
		public void ordercomplete() {
			WebElement title = driver.findElement(By.xpath("//h3[text()=' SPORTY SHOES - YOUR ORDERS ']"));
			String actual = title.getText();
			String expected = "SPORTY SHOES - YOUR ORDERS"; 
					
			Assert.assertEquals(actual, expected);
			
		}
	
	

}
