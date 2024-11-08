package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectList2 {
// file:///C:/Users/Pranav/Desktop/multiple.html
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pranav/Desktop/multiple.html");
		driver.manage().window().maximize();	
		
		WebElement w=driver.findElement(By.xpath("//select[@id='abc123']"));
		//Here if we do not take /option in xpath we use Select class otherwise we take /option
		
		Select sel=new Select(w);
		System.out.println(sel.isMultiple());
		
		sel.selectByVisibleText("NZ");
		
		sel.selectByIndex(3);
		
		System.out.println("--------------------");
		
		List<WebElement> l=sel.getAllSelectedOptions();
		for(WebElement e:l) {
			String s=e.getText();
			System.out.println(s);
		}
		
		System.out.println("--------------------");
		
		List<WebElement> l1=sel.getOptions();
		for(WebElement e1:l1) {
			String s=e1.getText();
			System.out.println(s);
		}
		
		sel.deselectByVisibleText("NZ");
		
		sel.deselectByIndex(3);
		
//		sel.deselectAll();

	}

}
