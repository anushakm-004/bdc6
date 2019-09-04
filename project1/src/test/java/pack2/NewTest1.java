package pack2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack1.Drivers;

public class NewTest1 {
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("chrome");
	 }
  @Test
  public void f() {
	  
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
  
}
