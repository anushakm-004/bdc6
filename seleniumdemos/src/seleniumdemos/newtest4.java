package seleniumdemos;

import org.testng.annotations.Test;

public class newtest4 {
  @Test(priority=3)
  public void testGoogle() {
System.out.println("testing Google");
  }
  
  @Test(priority=2)
  public void testFacebook() {
System.out.println("testing Facebook");
  }
  
  @Test(priority=1)
  public void testTwitter() {
System.out.println("testing Twitter");
  }
}
