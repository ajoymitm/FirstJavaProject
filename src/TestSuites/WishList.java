package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.NewWishlist;
import TestData.FirstDP;

public class WishList{
	WebDriver driver = Login.getDriver();
	@Test
	public void clickwishlist()
	{
		NewWishlist.Click_Wishlist(driver).click();
	}
	
	
	@Test(dataProvider="SearchProvider",dataProviderClass=FirstDP.class)
	public void wishlist(String username) {
		System.out.println("Inside Wishlist");
		// Properties prop=Login.getProp();
		// NewWishlist.Enter_Name(driver).sendKeys(prop.getProperty("username"));
		NewWishlist.Enter_Name(driver).sendKeys(username);
		NewWishlist.Submit_WishList(driver).click();
		NewWishlist.Enter_Name(driver).clear();
		System.out.println("Shopping is done now lets move to logout");

	}
}
