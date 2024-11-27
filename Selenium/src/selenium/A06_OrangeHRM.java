package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Thread.sleep(2000);
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		//login button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

		Thread.sleep(3000);
		//menu page option section
		driver.findElement(By.xpath("//div/ul/li/span[@class='oxd-userdropdown-tab']")).click();
		
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a[text()='Support']")).click();



	}

}
