package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
   
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name = 'uid']")
	public WebElement Username;
	@FindBy(xpath = "//input[@name = 'password']")
	public WebElement Password;
	@FindBy(xpath = "//input[@name = 'btnLogin']")
	public WebElement Submit;
	@FindBy(xpath = "//*[@class='heading3']")
	public WebElement successmessage;
	
	public loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
