package pom_DDF_TestNG_TestBase_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {

	public static String getExcelData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\Pranav.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");

		String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
	}

}
