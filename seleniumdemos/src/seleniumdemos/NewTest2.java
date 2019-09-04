package seleniumdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("hello");
  }
  @Test
  public void f1() {
	  System.out.println("hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

}
