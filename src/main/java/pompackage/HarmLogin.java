package pompackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HarmLogin 
{

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='txtUsername']")	
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")	
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement Login;
	
	public HarmLogin  (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	
	public void username(String usernamea) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		//Username.sendKeys("Admin");
	}
	
    public void password() 
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
    	Password.sendKeys("admin123");
    }
    
    public void login () 
    {
    	Login.click();
    }

	
		
	
     

}
