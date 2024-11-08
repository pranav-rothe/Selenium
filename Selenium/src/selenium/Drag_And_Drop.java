package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		WebElement src=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Actions alt=new Actions(driver);
		alt.dragAndDrop(src, des).perform();

//		alt.moveToElement(src).clickAndHold().moveToElement(des).release().perform();
	}

}
