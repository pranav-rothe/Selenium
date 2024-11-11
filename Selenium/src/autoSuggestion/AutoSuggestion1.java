package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
//  //div[@class='left-pane-results-container']//div[@class='s-suggestion-container']
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus");
		Thread.sleep(2000);
		
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']"));
		
		String name="oneplus nord ce 4 lite 5g";
		for(WebElement w:l) {
			String s=w.getText();
			System.out.println(s);
			if(name.equals(s)) {
				w.click();
				break;
			}
		}		
	}
}
