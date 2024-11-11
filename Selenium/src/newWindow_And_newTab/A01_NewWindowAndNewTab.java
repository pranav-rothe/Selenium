package newWindow_And_newTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_NewWindowAndNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.myntra.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.primevideo.com/");

		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
