package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.DriverClass;

public class CheckOutPage extends DriverClass {

	

	public void go_to_cart() {
		WebElement cart_list = driver.findElement(By.xpath("//a[@href='cart']"));
		cart_list.click();

		WebElement check_out = driver.findElement(By.xpath("//a[@href='checkout']"));
		check_out.click();

	}
}
