package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistory_Page {
	
	private static WebElement element = null;
	public static WebElement Click_Order_History_Details(WebDriver driver){

		element = driver.findElement(By.cssSelector(".myaccount-link-list>li>a>span"));
				return element;
		}
	}
