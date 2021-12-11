package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.DriverClass;

public class HomePage extends DriverClass {

	public void homecart() {
		WebElement back = driver.findElement(By.xpath("//a[@href='home']"));
		back.click();

	}
	
	public void cart1() {
		WebElement back = driver.findElement(By.xpath("//a[@href='home']"));
		back.click();
		WebElement cart1 = driver.findElement(By.xpath("//a[@href='cartadditem?id=107']"));
		cart1.click();
	}

	public void cart2() {
		WebElement back = driver.findElement(By.xpath("//a[@href='home']"));
		back.click();
		WebElement cart2 = driver.findElement(By.xpath("//a[@href='cartadditem?id=2']"));
		cart2.click();
	}

	public void cart3() {
		WebElement back = driver.findElement(By.xpath("//a[@href='home']"));
		back.click();
		WebElement cart3 = driver.findElement(By.xpath("//a[@href='cartadditem?id=105']"));
		cart3.click();
	}

	public void back_to_cart() {

		WebElement back = driver.findElement(By.xpath("//a[@href='home']"));
		back.click();

	}

}
