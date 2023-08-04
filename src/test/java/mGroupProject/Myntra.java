package mGroupProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void MyntraTest() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Myntra", true);
	  driver.get("https://www.myntra.com/");
	  
	  Thread.sleep(7000);
	  driver.close();
  }
}
