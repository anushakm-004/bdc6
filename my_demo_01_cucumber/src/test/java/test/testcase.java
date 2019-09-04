package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//import cucumber.api.java.en.Given;


public class testcase {
	WebDriver driver;
	
	@Given("Launch using chrome browser")
	public void launch_using_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver = Drivers.configureDriver("chrome");
        driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/login");
	}

	@Then("Enter the required valid credentials and Click on login")
	public void enter_the_required_valid_credentials_and_Click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.id("Email")).sendKeys("anushakm444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mAhesh_04");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

		

	@Given("Select any product")
	public void select_any_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		Actions act = new Actions(driver);
//	  	
//	  	act.moveToElement(driver.findElement(By.xpath("//class[contains(text(),'ELECTRONICS')]"))).
//	  	moveToElement(driver.findElement(By.xpath("//class[contains(text(),'Camera, photo\r\n" + 
//	  			"        ')]"))).
//	  	moveToElement(driver.findElement(By.xpath("//class[contains(text(),'Cell phones\r\n" + 
//	  			"        ')]"))).click().build().perform();
		
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
		driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		
		driver.findElement(By.xpath("//img[@title='Show details for Build your own cheap computer']")).click();
		//driver.findElement(By.xpath("//a[@href='/build-your-cheap-own-computer']")).click();
		
	}

	@Then("Add the selected product to the cart")
	public void add_the_selected_product_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("Goto to cart and see for the selected products and add or remove the products and update the cart")
	public void goto_to_cart_and_see_for_the_selected_products_and_add_or_remove_the_products_and_update_the_cart() {

		 driver.findElement(By.xpath("//a[@href='/jewelry']")).click();
		 
			driver.findElement(By.xpath("//img[@title='Show details for Black & White Diamond Heart']")).click();
			
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			
	}

	@Given("Logout from the website by clicking on logout")
	public void logout_from_the_website_by_clicking_on_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}
}
