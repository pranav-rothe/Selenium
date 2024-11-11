package toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement w=driver.findElement(By.xpath("(//img[@class='img_rb_vertical'])[1]"));
		WebElement w1=driver.findElement(By.xpath("//img[@class='rb_logo']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(w1).perform();
		Thread.sleep(2000);
		act.moveToElement(w).perform();
		
		String s=w1.getAttribute("title");
		System.out.println(s);

		String expected="Online Bus Tickets Booking";
		String actual=w.getAttribute("title");
		System.out.println(actual);

		if(expected.equals(actual)) {
			System.out.println("It's matching.");
		}
		else {
			System.out.println("It's not matching.");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
