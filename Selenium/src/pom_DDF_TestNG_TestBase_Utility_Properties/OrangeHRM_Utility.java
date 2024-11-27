package pom_DDF_TestNG_TestBase_Utility_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class OrangeHRM_Utility {

	//get excel data from local disk
	public static String getExcelData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		//Taking excel sheet input by using FielInputStream
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\OrangeHRM_TestData.xlsx");
		//get a workbook sheet by using Sheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String excelData=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return excelData;
	}
	
	public static void getScreenShot(WebDriver driver, int TCID) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Pranav\\git\\Selenium\\Selenium\\ScreenShot\\OrangeHRM_TCID_"+TCID+".jpg");
		FileHandler.copy(src, des);		
	}
	
	public static String getPFData(String key) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Pranav\\git\\Selenium\\Selenium\\OrangeHRMPropertyFile.properties");
		Properties p=new Properties();
		p.load(file);		
		String value=p.getProperty(key);
		return value;
	}
}
