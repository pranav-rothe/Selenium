package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions4 {

	public static void main(String[] args) {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("start-maximized");
		c.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.facebook.com/");


	}

}
