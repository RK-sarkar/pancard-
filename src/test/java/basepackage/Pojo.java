package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo 
{
	public static WebDriver openChromeBrowser () 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver   driver = new ChromeDriver ();
	     
	     driver.manage().window().maximize();
	     
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	     return driver;
	}

}
