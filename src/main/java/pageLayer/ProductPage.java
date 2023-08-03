package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// object methods
	
	@FindBy(xpath="")
	private WebElement add_to_cart_btn;
	
	@FindBy(xpath="")
	private WebElement click_on_popup;
	
	//action methods
	
	public void clickOnCartBtn()
	{
		add_to_cart_btn.click();
	}
	
	
	
	
}
