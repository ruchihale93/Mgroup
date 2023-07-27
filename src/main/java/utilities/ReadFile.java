package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	
	Properties pro;

	public ReadFile()
	{
		String path="C:\\Users\\Admin\\eclipse-workspace\\Mgroup\\src\\test\\resouces1\\config\\Config.properties";
		
		try {
			
			File file=new File(path);
			FileInputStream fis = new FileInputStream(file);
			 pro=new Properties();
			pro.load(fis);
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	
	}
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	

}
