package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.HarmLogin;
import pompackage.HrmHomePage;




public class HrmHomePageTest 
{
	 WebDriver driver;
		@BeforeClass
		public void beforeclass () 
		{
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		     driver = new ChromeDriver ();
		     
		     driver.manage().window().maximize();
		     
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		}
		@Test
		public void beforemethod ()
		{
		  HarmLogin login = new HarmLogin (driver);
		          // 	login.username();
			        login.password();
			        login.login();
			                
			String expectedURL= "https://opensource-demo.orangehrmlive.com/index.php";        
			String actualURL = driver.getCurrentUrl();
		//	Assert.assertEquals(actualURL, expectedURL);
		//	Assert.assertNotEquals(actualURL, expectedURL);
			
			SoftAssert s = new SoftAssert ();
			s.assertEquals(actualURL, expectedURL);
			
			
			System.out.println("URL is same");
			System.out.println("Case end");
			s.assertAll();
			        
		}
		@Test
		public void test() 
		{
			 HrmHomePage home = new HrmHomePage (driver);
		  boolean result=	home.validateAdimtab();
			Assert.assertTrue(result);
			
			home.validatePIMtab();
			home.validateLEAVEtab();
			
		}
		
	/*	@AfterMethod
		public void AfterMethod() 
		{
			 HrmHomePage home = new  HrmHomePage (driver);
			home.avtar();
			home.loogout();
		}
		
		@AfterClass
		public void afterClass() 
		{
			driver.quit();
		}*/
	 
}
