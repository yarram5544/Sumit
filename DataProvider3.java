package DataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
  public void OpenChromeBrowser(Object i) throws Exception {
	  
	  System.out.println(i);
	  
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public Object[] login(){
	  
	  Object[] data=new Object[] {
	  1,
	 "Hello",
	  3,
	  4
	  
	 
	  };
	  return data;
  }
  
  
  
  
}
