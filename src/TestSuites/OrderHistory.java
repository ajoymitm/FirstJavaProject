package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.OrderHistory_Page;

public class OrderHistory {
	WebDriver driver=Login.getDriver();
  @Test
  public void click_order_history_details() {
	  OrderHistory_Page.Click_Order_History_Details(driver).click();
  }
}
