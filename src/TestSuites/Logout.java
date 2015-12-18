package TestSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import PageObjects.Home_Page;

public class Logout {
	private static WebDriver driver = null;
	@AfterTest
	public static void main(String[] args) throws IOException {
		System.out.println("Inside Logout");
		Home_Page.Click_LogOut(driver).click();
		System.out.println(" Logout Successfull");

		driver.quit();

	}
}