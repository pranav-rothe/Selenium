package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {
		
		ChromeOptions c=new ChromeOptions();
		
		c.addArguments("--headless");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Ok");
		}
		else {
			System.out.println("Not match");
		}

	}

}
