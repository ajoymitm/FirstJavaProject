package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Home_Page {

private static WebElement element = null;

public static WebElement Click_Signin(WebDriver driver){

element = driver.findElement(By.className("login"));

return element;

}

public static WebElement Click_LogOut(WebDriver driver){

element = driver.findElement(By.className("logout"));

return element;

}

}
