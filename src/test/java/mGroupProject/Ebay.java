package mGroupProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay {
  @Test
  public void Ebaytest() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Ebay", true);
	  driver.get("https://www.ebay.com/");
	
	  Thread.sleep(7000);
	  driver.close();
  }
}
