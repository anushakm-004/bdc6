package seleniumdemos;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class test1 {
  @Test(dataProvider="loginCredentials")
  public void testLogin(String username,String pwd) {
	  System.out.println("Credentials:" + username +"," + pwd);
  }

  @DataProvider
  public Object[][] loginCredentials() {
    Object[][] data={
    		{"Lalitha","Password123"},
    		{"Admin","Password456"}
    };
    return data;
}
}
