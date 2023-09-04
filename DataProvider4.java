package DataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider4 {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
  public void OpenChromeBrowser(Integer i) throws Exception {
	  
	  System.out.println(i);
	  
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public Integer[] login(){
	  
	  Integer[] data=new Integer[] {
	  1,
	  3,
	  4
	  
	 
	  };
	  return data;
  }
  
  
  
  
}
