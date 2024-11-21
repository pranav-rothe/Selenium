package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A02_JioCinema {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement w=driver.findElement(By.xpath("//input[@placeholder='Movies, Shows and more']"));

		Actions act=new Actions(driver);

		act.moveToElement(w).perform();
		w.sendKeys("dune");

		WebElement w1=driver.findElement(By.xpath("//div[@id='results']/p"));

		act.moveToElement(w1);

		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


		//Below approach is regular
		//		String expected=": Part Two";
		//		List<WebElement> list=
		//		driver.findElements(By.xpath("//div[@id='results']/p/span[contains(text(), 'P')]"));
		//		for(WebElement w1: list) {
		//			String str=w1.getText();
		//			System.out.println(str);
		//			
		//			String actual=w1.getText();
		//			
		//			if(actual.equals(expected)) {
		//				w1.click();
		//				break;
		//			}
		//			System.out.println("TC Pass mukya bhau");
		//		}


	}

}
