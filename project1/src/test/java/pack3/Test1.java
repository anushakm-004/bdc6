package pack3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pack3.excel_utility1;


public class Test1 {
	
	WebDriver driver;
	
	 @BeforeTest
	 	
	 public void configureBrowser() {
		 driver = Drivers.configureDriver("chrome");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 }
  @Test(dataProvider="credentials1",priority=1)
  public void testRegistration(String uname,String fname,String lname,String pwd,String cpwd,String d,String mail,String num,
		   String mon1,String year1,String date1,String add,String sec,String ans) {
	  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(cpwd);
	  driver.findElement(By.xpath("//label[@class='form-control input-lg']")).sendKeys(d);
	  if(d.equals("Female"))
	  {
	   driver.findElement(By.xpath("//input[@value='Female']")).click();
	  }
	  else
	  {
	   driver.findElement(By.xpath("//input[@value='Male']")).click();
	  }
	  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(mail);
	  driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(num);
	  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
	  Select mon=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	  mon.selectByVisibleText(mon1);
	  Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	  year.selectByVisibleText(year1);
	  driver.findElement(By.linkText(date1)).click();
	  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(add);
	  Select que=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
	  que.selectByVisibleText(sec);
	  driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(ans);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  }
  
  @Test(dataProvider="credentials",priority=2)
  public void testLogin(String uname, String pwd) throws IOException {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.name("Login")).click();
	  Actions action=new Actions(driver);
	  
	  WebElement cart=driver.findElement(By.xpath("//input[@id='myInput']"));

	  cart.sendKeys("h");cart.sendKeys("e");cart.sendKeys("a");

	  //Thread.sleep(3000);

	  action.sendKeys(Keys.ARROW_DOWN).click();

	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

	  /* action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All\n" +

	  " Categories')]"))).

	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().

	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Travel Kit')]"))).click().build().perform();*/

	  driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();

	  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();

	  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();

	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();

	  driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();

	  driver.findElement(By.xpath("//a[@id='btn']")).click();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");

	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

	  driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");

	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();

	  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
  }
  
  @DataProvider
  public Object[][] credentials1() throws IOException{
  	return excel_utility1.readData();
  }
  
  @DataProvider
  public Object[][] credentials() throws IOException{
  	return excel_utility1.readData1();
  }
  
  @AfterTest
  public void closeApp() {
  	  driver.close();
  }
}
