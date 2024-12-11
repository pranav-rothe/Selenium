package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Text4 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		Thread.sleep(2000);

		WebElement	w=driver.findElement(By.xpath("//span[@id=\"sign_in_text\"]"));
		w.click();

		
		String s=w.getText();
		System.out.println(s);
	}

}
