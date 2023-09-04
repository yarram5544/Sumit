package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
  public void OpenChromeBrowser(String s) throws Exception {
	  
	  System.out.println(s);
	  
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public String[] login(){
	  
	  String[] data=new String[] {
	  "Admin",
	  "admin123",
	  
	 
	  };
	  return data;
  }
  
  
  
  
}
