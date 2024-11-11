package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='login-google-button']")).click();

		Set<String> g=driver.getWindowHandles();
		ArrayList<String> google=new ArrayList<String>(g);
		driver.switchTo().window(google.get(1));

		String gString=driver.getCurrentUrl();
		System.out.println(gString);
		driver.close();

		Thread.sleep(1000);

		driver.switchTo().window(google.get(0));

		driver.findElement(By.xpath("//button[@id='apple-signin-button']")).click();

		Set<String> a=driver.getWindowHandles();
		ArrayList<String> apple=new ArrayList<String>(a);
		driver.switchTo().window(apple.get(1));

		String aString=driver.getCurrentUrl();
		System.out.println(aString);
		driver.close();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
