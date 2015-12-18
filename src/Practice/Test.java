package Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

 /**
  * @param args
 * @throws InterruptedException 
  */
 public static void main(String[] args) throws InterruptedException {
  // Create a new instance of the Firefox driver
  WebDriver d = new FirefoxDriver();
  // Maximize the window.
  d.manage().window().maximize();
  // Navigate to URL
  d.get("http://newtours.demoaut.com/");
  d.findElement(By.name("userName")).sendKeys("mercury");
  d.findElement(By.name("password")).sendKeys("mercury");
  d.findElement(By.name("login")).click();
    //d.findElements(By.name("tripType")).get(1).click();
  
    List<WebElement> x = d.findElements(By.name("tripType"));

      for (int i = 0; i < x.size(); i++) {
        System.out.println("NUM:" + i + "/" + x.get(i).isSelected());
 }

 x.get(1).click();
 

 WebElement e1=d.findElement(By.name("passCount"));
 Select se1=new Select(e1);
 se1.selectByValue("1");
 
 WebElement e2=d.findElement(By.name("fromPort"));
 Select se2=new Select(e2);
 se2.selectByValue("London");  
 
 WebElement e3=d.findElement(By.name("fromMonth"));
 Select se3=new Select(e3);
 se3.selectByValue("3");
 
 WebElement e4=d.findElement(By.name("fromDay"));
 Select se4=new Select(e4);
 se4.selectByValue("16"); 
 
 WebElement e5=d.findElement(By.name("toPort"));
 Select se5=new Select(e5);
 se5.selectByValue("Frankfurt");  
 
 WebElement e6=d.findElement(By.name("toMonth"));
 Select se6=new Select(e6);
 se6.selectByValue("4");
 
 WebElement e7=d.findElement(By.name("toDay"));
 Select se7=new Select(e7);
 se7.selectByValue("15");
 
 
 List<WebElement> y = d.findElements(By.name("servClass"));

 for (int i = 0; i < x.size(); i++) {
   System.out.println("NUM:" + i + "/" + y.get(i).isSelected());
}

y.get(1).click();
WebElement e8=d.findElement(By.name("airline"));
Select se8=new Select(e8);
se8.selectByVisibleText("Blue Skies Airlines");

d.findElement(By.name("findFlights")).click();


List<WebElement> z = d.findElements(By.name("outFlight"));
z.get(1).click();

for (int i = 0; i < z.size(); i++) {
  System.out.println("NUM:" + i + "/" + z.get(i).isSelected());
}
  List<WebElement> a = d.findElements(By.name("inFlight"));

  for (int j = 0; j < a.size(); j++) {
    System.out.println("NUM:" + j + "/" + a.get(j).isSelected());
  }
    d.findElement(By.name("reserveFlights")).click(); 
    d.findElement(By.name("passFirst0")).sendKeys("Ajoy"); 
    d.findElement(By.name("passLast0")).sendKeys("Byascar");
    WebElement e9=d.findElement(By.name("pass.0.meal"));
    Select se9=new Select(e9);
    se9.selectByValue("HNML");
    WebElement e10=d.findElement(By.name("creditCard"));
    Select se10=new Select(e10);
    se10.selectByValue("CB") ;
     d.findElement(By.name("creditnumber")).sendKeys("0987654321"); 
        WebElement ea=d.findElement(By.name("cc_exp_dt_mn"));
    Select sea=new Select(ea);
    sea.selectByVisibleText("01");
        WebElement eb=d.findElement(By.name("cc_exp_dt_yr"));
    Select seb=new Select(eb);
    seb.selectByValue("2001") ;
        d.findElement(By.name("cc_frst_name")).sendKeys("Ajoy"); 
    d.findElement(By.name("cc_last_name")).sendKeys("Byascar");
        d.findElement(By.name("billAddress1")).sendKeys("This is testing Address1");
        d.findElement(By.name("billAddress2")).sendKeys("This is testing Address2");
        d.findElement(By.name("billCity")).sendKeys("Patna");
        d.findElement(By.name("billState")).sendKeys("Bihar");
        d.findElement(By.name("billZip")).sendKeys("000000");
                        WebElement ec=d.findElement(By.name("delCountry"));
        Select sec=new Select(ec);
        sec.selectByValue("2") ;
        Thread.sleep(6000);
        Alert alert = d.switchTo().alert();
        alert.accept();
                    d.findElement(By.name("delAddress1")).sendKeys("This is testing Address11");
            d.findElement(By.name("delAddress2")).sendKeys("This is testing Address211");
            d.findElement(By.name("delCity")).sendKeys("Patna1");
            d.findElement(By.name("delState")).sendKeys("Bihar1");
            d.findElement(By.name("delZip")).sendKeys("0000001");
                        WebElement ed=d.findElement(By.name("delCountry"));
            Select sed=new Select(ed);
            sed.selectByValue("2") ;
            d.findElement(By.name("buyFlights")).click();
                    
        
        d.close();
}

     }
