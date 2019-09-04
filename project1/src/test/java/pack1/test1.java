package pack1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("chrome");
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	  driver.findElement(By.xpath("//div[@class='btn-group'][4]")).click();
	  Select catDrop=new Select(driver.findElement(By.id("categorydropid")));
	  catDrop.selectByVisibleText("Electronics");
	  Select subCat=new Select(driver.findElement(By.id("subcategorydropid")));
	  //Select subCat.selectByIndex(2);
	  subCat.selectByVisibleText("Travel Kit");
	  driver.findElement(By.xpath("//input[@value='View Products']")).click();
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
}
  