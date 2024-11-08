package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\Pranav.xlsx");
		
		//By using Workbook interface
		Workbook w=WorkbookFactory.create(file);
		Sheet sh=w.getSheet("Sheet1");

		int rowsize=sh.getLastRowNum();
		for(int i=0;i<=rowsize;i++)
		{
			int columnsize=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=columnsize;j++)
			{
				Cell c=sh.getRow(i).getCell(j);
				System.out.print(c+" ");
				CellType type=c.getCellType();

				if(type==CellType.BOOLEAN)
				{
					boolean b=c.getBooleanCellValue();
					System.out.print(b+" ");
				}
				else if(type==CellType.STRING)
				{
					String s=c.getStringCellValue();
					System.out.print(s+" ");
				}
				else if(type==CellType.NUMERIC)
				{
					double d=c.getNumericCellValue();
					System.out.print(d+" ");
				}
			}
			System.out.println();
		}
	}
}
