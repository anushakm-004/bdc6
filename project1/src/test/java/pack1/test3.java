package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("chrome");
		 driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp");
		 	 }
  @Test
  public void testMethod() {
	  	Actions act = new Actions(driver);
	  	act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).
	  	moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
	  			"												Offices')]"))).
	  	moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).
	  	moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]"))).click().
	  	build().perform();
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
}
  