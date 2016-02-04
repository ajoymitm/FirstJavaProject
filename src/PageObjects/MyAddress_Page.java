package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddress_Page {
	private static WebElement element = null;
	public static WebElement Delete_Address(WebDriver driver){

		element = driver.findElement(By.xpath("//div[@id='center_column']/div/div/div/ul/li[9]/a[2]/span"));
		//element = driver.findElement(By.cssSelector(".btn.btn-default.button.button-small span"));
		
		return element;
		}
	public static WebElement Click_Address(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));
		//driver.findElement(By.cssSelector(".myaccount-link-list>li>a>span"));
		return element;
		
			}
	public static void Cancel_Alert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
		
	}
	public static WebElement Click_New_Address(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='center_column']/div[2]/a/span"));

		return element;
		
			}
	public static WebElement Enter_First_Name(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#firstname"));
		return element;
	}
	public static WebElement Enter_Last_Name(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#lastname"));
		return element;
	}
	public static WebElement Enter_Address(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#address1"));
		return element;
	}
	public static WebElement Enter_City(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#city"));
		return element;
	}
	public static WebElement Enter_Postal(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#postcode"));
		return element;
	}
}
