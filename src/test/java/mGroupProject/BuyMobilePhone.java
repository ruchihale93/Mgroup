package mGroupProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageLayer.HomePage;

public class BuyMobilePhone {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html#");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(3000);
	
	HomePage homepage_object=new HomePage(driver);
	homepage_object.clickOnMobileOption();
	homepage_object.clickOnSamsungGalaxy();
	
	
	}

}
