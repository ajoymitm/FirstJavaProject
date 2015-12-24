package TestSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.FirstShop_Page;


public class FirstShop {
	WebDriver driver=Login.getDriver();
  @Test(priority=1)
    public void click_image() {
	  FirstShop_Page.Click_Image(driver).click();
  }
  @Test(priority=2)
  public void click_second_thumbnail()
  {
	  FirstShop_Page.Click_Thumbnail2(driver).click();
  }
  @Test(priority=3)
  public void close_popup()
  {
	  FirstShop_Page.Popup_Close(driver).click();
  }
  @Test(priority=4)
  public void select_quantity()
  {
	  FirstShop_Page.Choose_Quantity(driver).sendKeys("2");
  }
  @Test(priority=5)
  public void select_size()
  {
	  WebElement e2=FirstShop_Page.Choose_Size(driver);
	  Select se2=new Select(e2);
	  se2.selectByIndex(1);
  }
  @Test(enabled=true,priority=6)
    public void click_addtocart()
  { 	  FirstShop_Page.click_add_to_cart(driver).click();
  }
  @Test(enabled=true,priority=7)
  public void click_proceed_checkout()
  {
	  FirstShop_Page.click_proceed_to_checkout(driver).click();
  }
  @Test(enabled=false,priority=8)
  public void click_addto_wishlist()
  {   driver.switchTo().defaultContent();
  	  FirstShop_Page.click_add_to_wishlist(driver).click();
  }
 @Test(enabled=false,priority=9)
 public void click_oncart()
 {    	  FirstShop_Page.click_on_cart(driver).click();
 }
}
