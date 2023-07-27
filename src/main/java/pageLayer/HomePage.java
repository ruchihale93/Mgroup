package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		//object methods
	
	@FindBy(xpath="(//a[@id='itemc'])[1]")
	private WebElement phones_option;
	
	@FindBy(xpath="(//a[@id='itemc'])[2]")
	private WebElement mobile_option;

	@FindBy(xpath="(//a[@id='itemc'])[3]")
	private WebElement monitor_option;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_mobile_option;
	
	
	// actions method
	
	public void clickOnPhoneOption()
	{
		phones_option.click();
	}
	public void clickOnMobileOption()
	{
		mobile_option.click();
	}
	public void clickOnMonitorOption()
	{
		monitor_option.click();
	}
	
	public void clickOnSamsungGalaxy()
	{
		samsung_mobile_option.click();
	}

}
