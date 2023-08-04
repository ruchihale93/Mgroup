package mGroupProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meeshow {
  @Test
  public void Ec_123_Meeshowtest() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Meesho", true);
	  driver.get("https://www.meesho.com/");
	
	  Thread.sleep(7000);
	  driver.close();
  }
}
