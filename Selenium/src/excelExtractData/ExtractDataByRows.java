package excelExtractData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractDataByRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//taking input file by using FileInputStream class
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\Pranav.xlsx");

		//File is create by using workbook interface
		Workbook w=WorkbookFactory.create(file);

		//By using sheet interface with the reference variable of workbook interface and get a sheet name
		Sheet sh=w.getSheet("Sheet1");

//		int rowsize=sh.getFirstRowNum();
//		for(int i=0;i<=rowsize;i++) {
//			
//			Row row=sh.getRow(i);
//			if(row!=null) {
//				for(int j=0;j<row.getLastCellNum();j++) {
//					System.out.print(row.getCell(j)+" ");
//				}
//				System.out.println();
//			}
//		}
//		int cellSize=sh.getRow(0).getLastCellNum()-1;
//		for(int i=0;i<=cellSize;i++) {
////			String data=sh.getRow(0).getCell(i);
//			System.out.println(sh.getRow(0).getCell(i));
//		}
		int rowSize=sh.getLastRowNum();
		for(int i=0;i<=rowSize;i++) {
//			String data=sh.getRow(0).getCell(i);
			System.out.println(sh.getRow(i).getCell(0));
		}
	}

}
