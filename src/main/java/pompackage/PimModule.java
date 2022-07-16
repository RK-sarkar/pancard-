package pompackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PimModule 
{
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath="//b[text()='PIM']")
	private WebElement Pim;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement EmployeeName;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Id;
	
	@FindBy(xpath="//select[@name='empsearch[employee_status]']")
	private WebElement EmployeeStatus;
	
	@FindBy(xpath="//select[@name='empsearch[termination]']")
	private WebElement Include;
	
	@FindBy(xpath="//input[@name='empsearch[supervisor_name]']")
	private WebElement Superviname;
	
	@FindBy(xpath="//select[@name='empsearch[job_title]']")
	private WebElement JobTitle;

	@FindBy(xpath="//select[@name='empsearch[sub_unit]']")
	private WebElement SubUnit;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	private WebElement Search;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement Add;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middlename;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='chkLogin']")
	private WebElement logindetail;
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='re_password']")
	private WebElement Confrompassword;
	
	@FindBy(xpath="//select[@name='status']")
	private WebElement Enable;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement BSave;
	
	
	public PimModule (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	    wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void pimtab () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//b[text()='PIM']")));
		Pim.click();
	}
	
	public void name () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@type='text'])[1]")));
		 EmployeeName.sendKeys("Odis");
		
	}
	
	public void id() 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@type='text'])[2]")));
		Id.sendKeys("0348");
		
	}
	public void status () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='empsearch[employee_status]']")));
		EmployeeStatus.click();
		Select se = new Select (EmployeeStatus);
		se.selectByValue("3");
	
		
	}
	public void inc ()  
	{
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='empsearch[termination]']")));
	    Include.click();
	    Select se = new Select (Include);
	    se.selectByValue("1");
	   
	}
	public void superviser () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='empsearch[supervisor_name]']")));
     	Superviname.sendKeys("John Smith");
	}
	public void title () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='empsearch[job_title]']")));
		JobTitle.click();
		Select se = new Select (JobTitle);
		se.selectByVisibleText("Engineer");
	}
	public void unit () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='empsearch[sub_unit]']")));
		SubUnit.click();
		Select se = new Select (SubUnit);
	    se.selectByValue("2");
	}
	public void sear () 
	{
		Search.click();
	}
	public void add () 
	{
		Add.click();
	}
	public void Fname () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='firstName']")));
	    firstname.sendKeys("lion");	
	}
	public void Mname () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='middleName']")));
		middlename.sendKeys("Tiger");
	}
	public void Lname () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='lastName']")));	
		lastname.sendKeys("sarkar");
	}
	public void click () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='chkLogin']")));	
		logindetail.click();
	}
	public void Uname ()  
	{
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='user_name']")));
	Username.sendKeys("NutanSarkarraj");
	 
    }
	public void Pword () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='user_password']")));
		Password.sendKeys("Nutan@Sarkar");
	}
	public void confrompass () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='re_password']")));
		Confrompassword.sendKeys("Nutan@Sarkar");
	}
	public void stas () 
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='status']")));
		Enable.click();
	}
	public void save () 
	{
		BSave.click();
	}
	
}

