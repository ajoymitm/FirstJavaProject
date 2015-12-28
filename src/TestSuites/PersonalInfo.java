package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.PersonalInfo_Page;

public class PersonalInfo {
	WebDriver driver=Login.getDriver();
  @Test
  public void click_mypersoalinfo() {
	  PersonalInfo_Page.Click_My_Personal_Info(driver).click();
	  
  }
  @Test
  public void click_order_history_and_details() {
	  PersonalInfo_Page.Click_My_Personal_Info(driver).click();
}
}
