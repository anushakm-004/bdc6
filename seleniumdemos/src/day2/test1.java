package day2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test1 {
  @Test
  public void f() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("first validation");
	  sa.assertEquals("hi", "hello");
	  System.out.println("second validation");
	  sa.assertEquals(10, 10);
	  sa.assertAll();
  }
}
