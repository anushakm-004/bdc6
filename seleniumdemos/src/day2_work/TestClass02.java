package day2_work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

public class TestClass02 {
  @Test(priority=1)
  public void tmethod3() {
	  System.out.println("method 3");  
  }
  @Test(priority=2)
  public void tmethod4() {
	  System.out.println("method 4");  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}
