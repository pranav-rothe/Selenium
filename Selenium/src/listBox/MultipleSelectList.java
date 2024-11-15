package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSelectList {
// file:///C:/Users/Pranav/Desktop/multiple.html
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pranav/Desktop/multiple.html");
		driver.manage().window().maximize();	
		
		List<WebElement> l=driver.findElements(By.xpath("//select[@id='abc123']/option"));
		//Here if we do not take /option in xpath we use Select class otherwise we take /option
		
		String aus="AUSTRALIA";
		String nz="NEWZEALAND";
		for(WebElement w:l)
		{
			String s=w.getText();
			System.out.println(s);
			
			if(aus.equals(s)) {
				w.click();
			}
			if(nz.equals(s)) {
				w.click();
			}
		}

	}

}
