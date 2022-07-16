package utiliy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityCode 
{
	WebDriver driver;
	public static void captureScreenshot (WebDriver driver) throws IOException 
	{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("dd-MM-yyyy  hh,mm,ss").format(new Date());
		File location= new File ("D:\\ScMethod\\img"+timestamp+".jpg");
		FileHandler.copy(Source, location);
	
	}
    public static String getdata (int row , int cell) throws EncryptedDocumentException, IOException 
    {
    	String path="C:\\Users\\hp\\OneDrive\\Desktop\\HramLog.xlsx";
    	FileInputStream file = new FileInputStream (path) ;
    	Sheet s = WorkbookFactory.create(file).getSheet("hrmLogDetail");	
    	String values = s.getRow(1).getCell(1).getStringCellValue();
    	return values;
    	
    }
}

