package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopsUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		WebElement w=driver.findElement(By.xpath("//input[@name='submit']"));
		w.click();

		Alert alt=driver.switchTo().alert();
		//alt.dismiss();
		String s=alt.getText();
		System.out.println(s);
		alt.accept();
		Thread.sleep(2000);
		String s1=alt.getText();
		System.out.println(s1);
		alt.accept();		
	}
}
