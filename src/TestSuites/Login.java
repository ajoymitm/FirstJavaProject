package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import PageObjects.Home_Page;
import PageObjects.Login_Page;

public class Login {
	private static Properties prop = new Properties();

	private static WebDriver driver = new FirefoxDriver();

	/**
	 * @param driver
	 *            the driver to set
	 */
	public static void setDriver(WebDriver driver) {
		Login.driver = driver;
	}
	@BeforeTest
	public static void test() throws IOException {
		System.out.println("Inside Login");
		PropertyConfigurator
				.configure("E:\\Auto\\FirstProject\\src\\Loggers\\log4j.properties");
		Logger log = Logger.getLogger("Log_File.logs");
		log.info("Testing has been started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File file = new File(
				"E:\\Auto\\FirstProject\\src\\Config\\config.properties");
		FileInputStream fileInput = null;
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
				.println(" Login Successfully, now it is the time to shop buddy");

	}

	/**
	 * @return the prop
	 */
	public static Properties getProp() {
		return prop;
	}

	/**
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	// index.php?controller=authentication&back=my-account

}