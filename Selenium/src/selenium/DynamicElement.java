package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=redmi&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		
		WebElement rating=driver.findElement(By.xpath("((//div[@class='_5OesEi'])[1]//span)[4]"));
		WebElement review=driver.findElement(By.xpath("((//div[@class='_5OesEi'])[1]//span)[6]"));
		
		
		String ratings=rating.getText();
		System.out.println(ratings);
		
		String reviews=review.getText();
		System.out.println(reviews);
		
		Thread.sleep(500);
		driver.quit();
		
		

	}

}
