package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_By_SelectClass {

//  //select[@name='birthday_day']
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement w=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select sel=new Select(w);
		
		sel.selectByVisibleText("29");
		
		Thread.sleep(2000);
		
		sel.selectByValue("24");
		
		Thread.sleep(2000);
		
		sel.selectByIndex(30);
		
		List<WebElement> l=sel.getOptions();
		
		for(WebElement e:l) {
			String s=e.getText();
			System.out.println(s);
		}
		
		}

}
