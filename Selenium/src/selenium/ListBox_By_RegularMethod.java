package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_By_RegularMethod {

// //select[@id='country']
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("//select[@id='country']/option"));
		
		String expected="France";
		for(WebElement x:l) {
			String s=x.getText();
//			System.out.println(s);
			if(expected.equals(s)) {
				x.click();
			}
		}

	}

}
