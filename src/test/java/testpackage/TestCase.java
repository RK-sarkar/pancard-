package testpackage;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Pojo;
import pompackage.HarmLogin;
import pompackage.PimModule;
import utiliy.UtilityCode;



public class TestCase extends Pojo
{
	 WebDriver driver;
		@BeforeClass
		public void beforeclass () 
		{
			driver=openChromeBrowser();
		
		}
		@BeforeMethod
		public void beforemethod () throws IOException
		{
		  HarmLogin login = new HarmLogin (driver);
		  login.username(UtilityCode.getdata(1, 1));
		  UtilityCode.captureScreenshot(driver);
		  login.password();
		  UtilityCode.captureScreenshot(driver);
		  login.login();
		
		}
		@Test
		public void test () throws IOException 
		{

			PimModule module = new PimModule (driver);
					 
			  module.pimtab();
			  module.name();
			  UtilityCode.captureScreenshot(driver);
			  module.id();
			  module.status();
			  module.inc();
			  module.superviser();
			  module.title();
			  module.unit();
			  module.sear();
			  module.add();
			  module.Fname();
			  module.Mname();
			  module.Lname();
			  module.click();
			  module.Uname();
			  module.Pword();
			  module.confrompass();
			  module.stas();
			  module.save();
		}
		@AfterMethod
		public void aftermethod () 
		{
			System.out.println("aftermethod");
		}
		@AfterClass
		public void afterclass () 
		{
			System.out.println("afterclass");
		}
}
