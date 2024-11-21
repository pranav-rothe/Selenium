package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_Spotify {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://open.spotify.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[contains(@class, 'CVuGEUIxLkNKpMds8AFS')]")).sendKeys("ve haaniyaan");
		
		driver.findElement(By.xpath("(//a[@class='btE2c3IKaOXZ4VNAb8WQ'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[contains(@class, 'dlTJiR')])[2]")).click();
	}

}
