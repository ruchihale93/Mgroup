package mGroupProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ReadFile;


public class Amazon {
	
	public static Logger logger;
	@BeforeTest
	public void start()
	{
		 logger=Logger.getLogger("Practice Framework");
		PropertyConfigurator.configure("log4jfile.properties");
		logger.info("Framework excution Started");
	}
	
	@AfterTest
	public void stop()
	{
		logger.info("Framework execution Stopped");
	}
  @Test
  public void AmazonTest() throws InterruptedException
  {
	  ReadFile read=new ReadFile();
	  WebDriver driver=new ChromeDriver();
	  logger.info("opening url");
	  Reporter.log("Opening amazon", true);
	  driver.get(read.getApplicationUrl());
	  logger.info("welcome to applicaton");
	  Thread.sleep(7000);
	  driver.close();
  }
}
