package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteAllCookies {

	public static void main(String[] args) {

		ChromeOptions c=new ChromeOptions();

		c.addArguments("--headless");
		WebDriver driver=new ChromeDriver(c);

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		System.out.println(driver.manage().getCookies().size());
		
		driver.manage().deleteAllCookies();

		System.out.println(driver.manage().getCookies().size());
	}

}
