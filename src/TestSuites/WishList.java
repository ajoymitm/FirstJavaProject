package TestSuites;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.NewWishlist;

public class WishList extends Login {
	@Test
	public void wishlist() {
		System.out.println("Inside Wishlist");
		// Properties prop=Login.getProp();
		WebDriver driver = Login.getDriver();
		driver.findElement(
				By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/ul/li/a/span"))
				.click();
		// NewWishlist.Enter_Name(driver).sendKeys(prop.getProperty("username"));
		NewWishlist.Enter_Name(driver).sendKeys("username");
		NewWishlist.Submit_WishList(driver).click();

	}
}
