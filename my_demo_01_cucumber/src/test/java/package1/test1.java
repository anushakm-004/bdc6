//package package1;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import package1.Drivers;
//
//public class test1 {
//
//	
//WebDriver driver;
//@Given("Application is launched by guest user")
//public void application_is_launched_by_guest_user() {
//    // Write code here that turns the phrase above into concrete actions
//    //throw new cucumber.api.PendingException();
//	
//	 driver = Drivers.configureDriver("chrome");
//	 driver.manage().window().maximize();
//	 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
//}
//
//@When("User clicks on sign In link available")
//public void user_clicks_on_sign_In_link_available() {
//    // Write code here that turns the phrase above into concrete actions
//    //throw new cucumber.api.PendingException();
//	
//	  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
//
//}
//
//@When("provides the required data in the form")
//public void provides_the_required_data_in_the_form() {
//    // Write code here that turns the phrase above into concrete actions
//    //throw new cucumber.api.PendingException();
//	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Saranya12");
//	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Saranya");
//	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kalimuthu");
//	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nanthusaran");
//	  driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("nanthusaran");
//	  driver.findElement(By.xpath("//input[@value='Female']")).click();
//	  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("nanthini@gmail.com");
//	  driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9445430180");
//	  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
//	  driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
//	  Select mon=new Select( driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
//	  mon.selectByVisibleText("Dec");
//	  driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
//	  Select year=new Select( driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
//	  year.selectByVisibleText("2000");
//	  driver.findElement(By.linkText("12")).click();
//	  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Dhivyashree Technopark");
//	  Select security=new Select(driver.findElement(By.xpath("//select[@name='securityQuestion']")));
//	 security.selectByVisibleText("What is your Birth Place?");
//	  driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Erode");	
//}
//
//@Then("user submits the data")
//public void user_submits_the_data() {
//    // Write code here that turns the phrase above into concrete actions
//    //throw new cucumber.api.PendingException();
//	  driver.findElement(By.xpath("//input[@type='submit']")).click();
//}
//
//@Then("verifies for the account creation")
//public void verifies_for_the_account_creation() {
//    // Write code here that turns the phrase above into concrete actions
//    //throw new cucumber.api.PendingException();
//	  String msg = driver.findElement(By.xpath("/html/body/header/div/b/a")).getText();
//	  Assert.assertEquals(msg,"Home");	
//}
//}
