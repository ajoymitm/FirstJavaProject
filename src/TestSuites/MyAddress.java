package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.MyAddress_Page;

public class MyAddress {
	WebDriver driver= Login.getDriver();
	@Test(priority=0)
	  public void click_address() {
		 MyAddress_Page.Click_Address(driver).click();
	  }
  @Test(priority=1)
  public void click_delete_address() {
	 MyAddress_Page.Delete_Address(driver).click();
  }
  @Test(priority=2)
  public void click_cancel_alert() {
	 MyAddress_Page.Cancel_Alert(driver);
  }
  @Test(priority=3)
  public void click_new_address() {
	 MyAddress_Page.Click_New_Address(driver).click();
  }
  @Test(priority=4)
  public void enter_first_name() {
	 MyAddress_Page.Enter_First_Name(driver).sendKeys("FirstName1");
  }
  @Test(priority=5)
  public void enter_last_name() {
	 MyAddress_Page.Enter_Last_Name(driver).sendKeys("LastName1");
  }
  @Test(priority=6)
  public void enter_address() {
	 MyAddress_Page.Enter_Address(driver).sendKeys("This is test address1");
  }
  @Test(priority=7)
  public void enter_city() {
	 MyAddress_Page.Enter_City(driver).sendKeys("This is test address1");
  }
  @Test(priority=8)
  public void enter_postal_code() {
	 MyAddress_Page.Enter_Postal(driver).sendKeys("This is test address1");
  }
}
