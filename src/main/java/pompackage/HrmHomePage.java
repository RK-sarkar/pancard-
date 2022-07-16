package pompackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrmHomePage
{
	WebDriver driver;
	WebDriverWait wait;
  @FindBy(xpath=("//b[text()='Admin']"))
  private WebElement admin;
  
  @FindBy(xpath=("//b[text()='PIM']"))
  private WebElement pim;
  
  @FindBy(xpath=("//b[text()='Leave']"))
  private WebElement leave;
	
  @FindBy(xpath=("//a[@id='welcome']"))
  private WebElement welcome;
	
  @FindBy(xpath=("//a[text()='Logout']"))
  private WebElement logout;
  
  
  public HrmHomePage (WebDriver driver) 
  {
	  this.driver=driver;
	PageFactory.initElements(driver, this); 
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  
  }
  public boolean validateAdimtab ()
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Admin']")));
	   boolean result= admin.isDisplayed();
	   return result;
  }
  public void validatePIMtab () 
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='PIM']")));
	  pim.isDisplayed(); 
  }
  public void validateLEAVEtab () 
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Leave']")));
	  leave.isDisplayed(); 
  }
  public void avtar () 
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
	  welcome.click(); 
  }
  public void loogout () 
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	  logout.click();
  }
  
  
}
