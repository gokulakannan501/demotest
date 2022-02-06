package objecthandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusable {
	
	public WebDriver driver;
	
	public Reusable(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusername(WebElement element, String value)
	 {
		 
			 element.sendKeys(value);
}
	 
	 public void enterpassword(WebElement element, String value)
	 {
		
			 element.sendKeys(value);
			 
		 
	 }
	 
	 public void clicksubmit(WebElement element)
	 {
		
			 element.click();
		 
	 }
	 
}
