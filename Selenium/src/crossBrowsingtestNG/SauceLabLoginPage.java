package crossBrowsingtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceLabLoginPage {
	
	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void loginSauceLab(String browserName) {
		
		if(browserName.equals("chrome")) {
			driver =new ChromeDriver();
		}
		else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}		

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();

		String actTitle = driver.getTitle();
		String expTitle = "Swag Labs";

		if(actTitle.equals(expTitle))
		{
			System.out.println("TC Pass");
		}
		else {
			System.out.println("TC Failed");
		}
	}
}
