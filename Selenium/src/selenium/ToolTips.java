package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement w=driver.findElement(By.xpath("//div[@jscontroller='unV4T']"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();

		String expected="Search by voice";
		String actual=w.getAttribute("aria-label");
		System.out.println(actual);

		if(expected.equals(actual)) {
			System.out.println("It's matching.");
		}
		else {
			System.out.println("It's not matching.");
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
