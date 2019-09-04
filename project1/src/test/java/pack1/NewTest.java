package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	  
		WebDriver driver;
		
		 @BeforeTest
		 	
		 public void configureBrowser() {
			 driver = Drivers.configureDriver("chrome");
		 }
@Test
public void testLogin() {
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	//System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Home");
	driver.findElement(By.linkText("SignOut")).click();
}


@AfterTest
public void closeApp() {
	  driver.close();
}
}
