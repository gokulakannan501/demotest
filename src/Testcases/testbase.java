package Testcases;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase {
	
    public static WebDriver driver;
    public static Properties prop;
    
static 
{
	try 
	{

File f= new File("C:\\Users\\USER\\eclipse-workspace\\demotest\\src\\input.properties");
FileInputStream readfile=new FileInputStream(f);
prop=new Properties();
prop.load(readfile);

	System.out.println(prop.getProperty("URL"));
	}
	catch(Exception e )

	{
	System.out.println(e);
	}
	
String browserName = "chrome";
if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\driver\\chrome97\\chromedriver.exe");
	driver = new ChromeDriver();
}
	else if(browserName.equals("FF"))
{
		System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");
		driver = new FirefoxDriver();
}
driver.manage().window().maximize();
}
}

