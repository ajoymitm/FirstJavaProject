package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstShop_Page {
	private static WebElement element = null;
//Method for clicking on Faded Short Sleeve T-shirts
	public static WebElement Click_Image(WebDriver driver){

	element = driver.findElement(By.cssSelector("img.replace-2x.img-responsive"));

	return element;
	}
	
	public static WebElement Click_Thumbnail2(WebDriver driver){

		element = driver.findElement(By.id("thumb_2"));

		return element;
	}
		
		public static WebElement Popup_Close(WebDriver driver){

			element = driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close"));

			return element;

	}
		public static WebElement Choose_Quantity(WebDriver driver){

			element = driver.findElement(By.id("quantity_wanted"));

			return element;

	}	
		public static WebElement Choose_Size(WebDriver driver){

			element = driver.findElement(By.id("group_1"));

			return element;

	}

		public static WebElement click_add_to_cart(WebDriver driver) {
			element = driver.findElement(By.cssSelector("button.exclusive"));

			return element;
			
		}

		public static WebElement click_proceed_to_checkout(WebDriver driver) {
			element = driver.findElement(By.cssSelector(".btn.btn-default.button.button-medium>span"));
			return element;
		}	
		
		public static WebElement click_add_to_wishlist(WebDriver driver)
		{  
			element = driver.findElement(By.id("wishlist_button"));
			return element;
		}

		public static WebElement click_on_cart(WebDriver driver) {
			element = driver.findElement(By.cssSelector(".shopping_cart>a>b"));
			return element;
		}
	}
