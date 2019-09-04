package day2_work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

public class TestClass01 {
  @Test(priority=2)
  public void tmethod1() {
	  System.out.println("method 1");  
  }
  @Test(priority=1)
  public void tmethod2() {
	  System.out.println("method 2");  
  }
  @Test(priority=3)
  public void tmethod5() {
	  System.out.println("method 5");  
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
