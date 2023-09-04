package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray2 {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
public void OpenChromeBrowser(Object[] s) throws Exception {
	  
	  //System.out.println(Username +">>" +password);
	  
	 // System.out.println(s[0]+ ">>" +s[1]);
	  for(int i=0; i<s.length; i++) {
		  System.out.println(s[i]);
		
	  }
	  System.out.println("*********************************");
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public Object[][] login(){
	  
	  Object[][] data=new Object[][] {
		  {"abc",123,"adasd"},
		  {"ghi","jkl",456,789},
		  {"mno","pqr","adasdasd","Adasdas"}
	 
	  };
	  return data;
  }
  
  
  
  
}
