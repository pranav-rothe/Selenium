package selenium;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.close();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
		
		
		
	}

}
