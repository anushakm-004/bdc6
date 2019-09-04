package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test6 {
	  
		WebDriver driver;
		
		 @BeforeTest
		 	
		 public void configureBrowser() {
			 driver = Drivers.configureDriver("chrome");
			 driver.manage().window().maximize();
		 }
@Test(dataProvider="credentials")
public void testLogin(String uname, String pwd) {
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By.id("userName")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.name("Login")).click();
	//System.out.println(driver.getTitle());
	//Assert.assertEquals(driver.getTitle(), "Home");
	driver.findElement(By.linkText("SignOut")).click();
}

@DataProvider
public Object[][] credentials() throws IOException{
	return excel_utility.readData();
}

@AfterTest
public void closeApp() {
	  driver.close();
}
}
