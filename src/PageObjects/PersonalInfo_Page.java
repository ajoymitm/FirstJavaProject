package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInfo_Page {
	
	private static WebElement element = null;
	public static WebElement Click_My_Personal_Info(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
				return element;
		}
	}
