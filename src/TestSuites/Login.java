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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Home_Page;
import PageObjects.Login_Page;

public class Login {
	private static Properties prop = new Properties();

	private static WebDriver driver = new FirefoxDriver();
	public static void setDriver(WebDriver driver) {
		Login.driver = driver;
	}
	@BeforeSuite
		public static void login() throws IOException 
	{
		System.out.println("Inside Login");
		PropertyConfigurator
				.configure("D:\\Auto_Ajoy\\MainProject\\src\\Loggers\\log4j.properties");
		Logger log = Logger.getLogger("Log_File.logs");
		log.info("Testing has been started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File file = new File(
				"D:\\Auto_Ajoy\\MainProject\\src\\Config\\config.properties");
		FileInputStream fileInput = null;
		try 
		{
			fileInput = new FileInputStream(file);

			prop.load(fileInput);
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Test(groups="login", priority=0)
    public void geturl()
    {
		driver.get(prop.getProperty("url"));
    }
	@Test(groups="login",priority=1)
    public void clicksignin()
    {
		Home_Page.Click_Signin(driver).click();
    }
	@Test(groups="login",priority=2)
    public void enter_username()
    {
		Login_Page.Enter_UserName(driver)
				.sendKeys(prop.getProperty("username"));
    }
	@Test(groups="login",priority=3)
    public void enter_password()
    {
		Login_Page.Enter_Password(driver)
				.sendKeys(prop.getProperty("password"));
    }
	@Test(groups="login",priority=4)
    public void click_login()
    {
		Login_Page.Click_LogIn(driver).click();
		System.out
		.println(" Login Successfully, now it is the time to shop buddy");
    }

		


		public static Properties getProp() {
		return prop;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}