package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("virat kohli");
		Thread.sleep(2000);
		
		List<WebElement> element=driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d'])[1]"));
		
		String actual="Virat Kohli";
		for(WebElement w:element) {
			String expected=w.getText();
			System.out.println(expected);
			if(expected.equals(actual)) {
				System.out.println("Pass");
				w.click();
			}
			else {
				System.out.println("Fail");
			}
		}

	}

}
