package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Practice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pranav/Desktop/WebTable.html");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.id("example-table"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		WebElement headerRows=rows.get(0);
		
		List<WebElement> headers=headerRows.findElements(By.tagName("th"));
		
		for(WebElement header:headers) {
			System.out.print(header.getText()+"\t");
		}
		System.out.println();
		
		for(int i=1;i<rows.size();i++) {
			List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
			
			for(WebElement cell:cells) {
				System.out.print(cell.getText()+"\t");
			}
			System.out.println();
		}
	}

}
