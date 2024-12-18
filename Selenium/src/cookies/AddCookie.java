package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddCookie {

	public static void main(String[] args) {

		ChromeOptions c=new ChromeOptions();

		c.addArguments("--headless");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Cookie c1=new Cookie("Biscuit", "Parle G");
		driver.manage().addCookie(c1);
		
		Set<Cookie> s=driver.manage().getCookies();
		
		for(Cookie allCookies: s) {
			System.out.println(allCookies);
		}
		
		
	}

}
