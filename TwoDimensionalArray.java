package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
public void OpenChromeBrowser(String Username, String password)  throws Exception {
	  
	  System.out.println(Username +"__________" +password);
	  
	  //System.out.println(k[0]+ ">>" +k[1]);
	  
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public String[][] login(){
	  
	  String[][] data=new String[][] {
		  {"abc","def"},
		  {"ghi","jkl"},
		  {"mno","pqr"}
	 
	  };
	  return data;
  }
  
  
  
  
}
