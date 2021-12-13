package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.DriverClass;

public class CheckOutPage extends DriverClass {

	public void go_to_cart() {
		WebElement cart_list = driver.findElement(By.xpath("//a[@href='cart']"));
		cart_list.click();

		WebElement check_out = driver.findElement(By.xpath("//a[@href='checkout']"));
		check_out.click();

	}

	public void payment_gateway() {

		WebElement cart_list = driver.findElement(By.xpath("//a[@href='gateway']"));
		cart_list.click();

	}

	public void assert_payment_gateway() {
		WebElement exptitle = driver.findElement(By.xpath("//h3[text()=' SPORTY SHOES - PAYMENT GATEWAY ']"));
		String expected = exptitle.getText();
		String actual = "SPORTY SHOES - PAYMENT GATEWAY";
		Assert.assertEquals(actual, expected);

	}

}
