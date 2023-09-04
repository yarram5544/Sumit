package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;
	
  @Test(dataProvider ="LoginTestData")
  public void OpenChromeBrowser(String Username, String Password) throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys(Username);
	  driver.findElement(By.name("password")).sendKeys(Password);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);
	
	  
	  
	  
  }
  
  @DataProvider(name="LoginTestData")
  public Object[][] login(){
	  
	  Object[][] data=new Object[4][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  
	  data[1][0]="Admin";
	  data[1][1]="testdata";
	  
	  
	  data[2][0]="Admin1";
	  data[2][1]="admin123";
	  
	  
	  data[3][0]="Admin1";
	  data[3][1]="testdata";
	  
	  return data;
  }
  
  
  
  
}
