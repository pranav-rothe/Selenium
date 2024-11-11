package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		
//		driver.switchTo().frame("iframeResult"); by id or name
		WebElement i=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(i);//by webElement
		
		WebElement btl=driver.findElement(By.xpath("//button[contains(text(),'Date and Time.')]"));
		btl.click();
		
		driver.switchTo().defaultContent();
		
		WebElement btl1=driver.findElement(By.xpath("//a[@id='menuButton']"));
		btl1.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
