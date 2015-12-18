package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Home_Page;
import PageObjects.Login_Page;

public class First_Test {

	private static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		PropertyConfigurator
				.configure("D:\\Auto_Ajoy\\MainProject\\src\\Loggers\\log4j.properties");
		Logger log = Logger.getLogger("Log_File.logs");
		log.info("Testing has been started");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File file = new File
		("D:\\Auto_Ajoy\\MainProject\\src\\Config\\config.properties");
		FileInputStream fileInput = null;
		Properties prop = new Properties();
		try {
			fileInput = new FileInputStream(file);
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.get(prop.getProperty("url"));

		// Use page Object library now

		Home_Page.Click_Signin(driver).click();

		Login_Page.Enter_UserName(driver)
				.sendKeys(prop.getProperty("username"));

		Login_Page.Enter_Password(driver)
				.sendKeys(prop.getProperty("password"));

		Login_Page.Click_LogIn(driver).click();

		System.out
				.println(" Login Successfully, now it is the time to Log Off buddy.");

		Home_Page.Click_LogOut(driver).click();
		System.out.println(" Logout Successfull");

		driver.quit();

	}

	// index.php?controller=authentication&back=my-account

}