package TestSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import PageObjects.Home_Page;

public class Logout {
	WebDriver driver = Login.getDriver();
	@AfterSuite
	public void loguout() throws IOException {
		System.out.println("Inside Logout");
		Home_Page.Click_LogOut(driver).click();
		System.out.println(" Logout Successfull");
//		driver.close();

	}
}