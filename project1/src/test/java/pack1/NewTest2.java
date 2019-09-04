package pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack1.Drivers;

public class NewTest2 {
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("chrome");
		 driver.manage().window().maximize();
	 }
  @Test
  public void testMethod() {
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password456");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertEquals(driver.getTitle(),"Admin Home");
	  String msg=driver.findElement(By.xpath("/html/body/header/div/b")).getText();
	  Assert.assertEquals(msg, "Hi, Admin    SignOut");
	  driver.findElement(By.xpath("//div[@class='btn-group'][2]")).click();
	  driver.findElement(By.xpath("//input[@id='catgName']")).sendKeys("Holidays");
	  driver.findElement(By.xpath("//input[@id='catgDesc']")).sendKeys("Bags");
	  driver.findElement(By.xpath("//input[@value='Add']")).click();
	  
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
  
}
