package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions3 {

	public static void main(String[] args) {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("start-maximized");
		c.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://pushalert.co/demo");


	}

}
