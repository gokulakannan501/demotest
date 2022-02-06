package Testcases;

import org.testng.annotations.Test;

import objecthandler.Reusable;
import pageobject.loginpage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class NewTest {
	public WebDriver driver;
	public Properties prop;
	testbase test = new testbase();
  @Test(priority = 0, enabled = false)
  public void login() throws InterruptedException {
	  
	  loginpage login = new loginpage(driver);
	  Reusable reuse = new Reusable(driver);
	  String demourl = prop.getProperty("demourl");
	  String Username = prop.getProperty("Username");
	  String Password = prop.getProperty("Password");
	  driver.get(demourl);
	  reuse.enterusername(login.Username, Username);
	  reuse.enterpassword(login.Password, Password);
	  reuse.clicksubmit(login.Submit);
	  Thread.sleep(10000);
	  String pagetitle = driver.getTitle();
	  String title = "Guru99 Bank Manager HomePage";
	  if(pagetitle.equals(title))
	  {
		 Reporter.log("Log in successful");
		 Reporter.log(pagetitle);
	  }
	  
	  else
	  {
		  Reporter.log("Log in failed");
	  }
	}
  @Test(priority = 1, enabled = false)
  public void invalidusername()
  {
	  loginpage login = new loginpage(driver);
	  Reusable reuse = new Reusable(driver);
	  String demourl = prop.getProperty("demourl");
	  String Username = prop.getProperty("Invalidusername");
	  String Password = prop.getProperty("Password");
	  driver.get(demourl);
	  reuse.enterusername(login.Username, Username);
	  reuse.enterpassword(login.Password, Password);
	  reuse.clicksubmit(login.Submit);
	  String alert = driver.switchTo().alert().getText();
	  Reporter.log(alert);
	  driver.switchTo().alert().accept();
  }
  
  @Test(priority = 2, enabled = false)
  public void invalidpassword()
  {
	  loginpage login = new loginpage(driver);
	  Reusable reuse = new Reusable(driver);
	  String demourl = prop.getProperty("demourl");
	  String Username = prop.getProperty("Username");
	  String Password = prop.getProperty("Invalidpassword");
	  driver.get(demourl);
	  reuse.enterusername(login.Username, Username);
	  reuse.enterpassword(login.Password, Password);
	  reuse.clicksubmit(login.Submit);
	  String alert = driver.switchTo().alert().getText();
	  Reporter.log(alert);
	  driver.switchTo().alert().accept();
  }
  
  @Test(priority = 3, enabled = true)
  public void invalidcredentials()
  {
	  loginpage login = new loginpage(driver);
	  Reusable reuse = new Reusable(driver);
	  String demourl = prop.getProperty("demourl");
	  String Username = prop.getProperty("Invalidusername");
	  String Password = prop.getProperty("Invalidpassword");
	  driver.get(demourl);
	  reuse.enterusername(login.Username, Username);
	  reuse.enterpassword(login.Password, Password);
	  reuse.clicksubmit(login.Submit);
	  String alert = driver.switchTo().alert().getText();
	  Reporter.log(alert);
	  driver.switchTo().alert().accept();
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = this.test.driver;
	  prop = this.test.prop;
	  
  }

}
