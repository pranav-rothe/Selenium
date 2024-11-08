package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pranav/Desktop/WebTableHandling.html");
		driver.manage().window().maximize();
		
		//Whole table xpath
		WebElement table=driver.findElement(By.xpath("//table[@id='123']"));

		//Locate all the rows in the table
		List<WebElement> rows=table.findElements(By.tagName("tr"));

		//Handle the header row (first row)
		WebElement headerRow=rows.get(0);
		
		//Locate all the headers in the table
		List<WebElement> headers=headerRow.findElements(By.tagName("th"));

		//for taking an all header text
		for(WebElement header:headers) {
			System.out.print(header.getText() +"\t");
		}
		System.out.println();

		// Loop through each remaining row (data rows)
		for(int i=1;i<rows.size();i++) {
			
			//it get cells of each row element and Start from 1 to skip the header row
			List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));

			for(WebElement cell:cells) {
				System.out.print(cell.getText() +"\t");
			}
			System.out.println();
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
