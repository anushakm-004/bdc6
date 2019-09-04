package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("explorer");
		 driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp");
		 	 }
  @Test
  public void testMethod() {
	  driver.findElement(By.xpath("//input[@name='products']")).sendKeys("wear");
	  
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();	
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  String msg=driver.findElement(By.xpath("//h4[contains(text(),'Summer wear')]")).getText();
	  Assert.assertEquals(msg, "Summer wear");
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
}

  