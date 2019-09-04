package pack1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	
 @BeforeTest
 	
 public void configureBrowser() {
	 driver = Drivers.configureDriver("chrome");
 }
 
  @Test
  
  public void openApplication() {
	  driver.get("http://www.w3schools.com");
  }
  @AfterTest
  public void closeApp() {
	  driver.close();
  }
}
