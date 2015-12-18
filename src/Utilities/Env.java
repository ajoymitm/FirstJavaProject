package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Env {
  
  	  private static WebDriver driver = null;
  	@Test
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
			
  }
}
