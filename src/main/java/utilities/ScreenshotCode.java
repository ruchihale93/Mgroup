package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCode {
	
	
	public static void takeSS(String filename)
	{
		String path="C:\\Users\\Admin\\eclipse-workspace\\Mgroup\\screenshots\\";
		WebDriver driver=new ChromeDriver();
		try {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path+filename+".png");
			
			FileHandler.copy(src, des);
		} 
		catch (IOException e)
		{
			System.out.println("file path is not correct");
			e.printStackTrace();
		}
	}

}
