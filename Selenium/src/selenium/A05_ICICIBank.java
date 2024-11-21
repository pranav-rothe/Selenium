package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A05_ICICIBank {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement w=driver.findElement(By.xpath("(//div[@class='menu-nav-tab'])[5]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(w).perform();
		
		List<WebElement> l =driver.findElements(By.xpath("//div[@class='left-container ']/ul/li/a[contains(text(), 'Account')]"));
		
		
		String s="Salary Account";
		for(WebElement list: l) {
			
			String str=list.getText();
			System.out.println(str);
			
			if(str.equals(s)) {
				list.click();
				break;
			}
		}
	}

}
