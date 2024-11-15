package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S01_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pranav/Desktop/multiple.html");
		driver.manage().window().maximize();
		
		WebElement web=driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select sel=new Select(web);
		boolean multiple=sel.isMultiple();
		System.out.println(multiple);
		
		//sel.selectByIndex(3); //select by index
		
		Thread.sleep(2000);
		sel.deselectAll();
		
		
		System.out.println("****GET ALL THE LIST NAMES****");
		String nz="NEWZEALAND";
		String aus="AUSTRALIA";
		String brz="BRAZIL";
		List<WebElement> l=sel.getOptions();
		for(WebElement list:l) {
			String str=list.getText();
			System.out.println(str);
			
			if(nz.equals(str)) {
				list.click();
			}
			if(aus.equals(str)) {
				list.click();
			}
			if(brz.equals(str)) {
				list.click();
			}
		}		
		
//		Thread.sleep(2000);
//		driver.quit();
		

	}

}
