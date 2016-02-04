package PageObjects;

import junit.framework.Assert;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class Login_Page {
 
        private static WebElement element = null;
 
    public static WebElement Enter_UserName(WebDriver driver){
 
         element = driver.findElement(By.id("email"));
 
         return element;
 
         }
 
     public static WebElement Enter_Password(WebDriver driver){
 
         element = driver.findElement(By.id("passwd"));
 
         return element;
 
         }
 
     public static WebElement Click_LogIn(WebDriver driver){
 
         element = driver.findElement(By.id("SubmitLogin"));
 
         return element;
 
         }

	public static void Verify_LogIn(WebDriver driver) {
		String title=driver.getTitle();
		System.out.println("Actual Title is" +title);
		Assert.assertEquals("My Store", title);
		
	}
 
}
