package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray {
	WebDriver driver;
  @Test(dataProvider ="LoginTestData")
public void OpenChromeBrowser(String[] s) throws Exception {
	  
	  //System.out.println(Username +">>" +password);
	  
	 // System.out.println(s[0]+ ">>" +s[1]);
	  for(int i=0; i<s.length; i++) {
		  System.out.println(s[i]);
		
	  }
	  System.out.println("*********************************");
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public String[][] login(){
	  
	  String[][] data=new String[][] {
		  {"abc","def","adasd"},
		  {"ghi","jkl"},
		  {"mno","pqr","adasdasd","Adasdas"}
	 
	  };
	  return data;
  }
  
  
  
  
}
