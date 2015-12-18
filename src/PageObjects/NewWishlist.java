package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWishlist {

	/**
	 * @param args
	 */
	private static WebElement element = null;
	public static WebElement Enter_Name(WebDriver driver){
		 
        element = driver.findElement(By.id("name"));
        return element;

	}
	public static WebElement Submit_WishList(WebDriver driver){
		 
        element = driver.findElement(By.id("submitWishlist"));
        return element;
	
}
}
