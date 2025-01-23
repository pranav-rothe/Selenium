package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteParticularCookie {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Set<Cookie> c=driver.manage().getCookies();
		
		
		for(Cookie allCookies: c) {
			System.out.println(allCookies);
		}		
		System.out.println(c.size());
		
		driver.manage().deleteCookieNamed("currency");
		Set<Cookie> c1=driver.manage().getCookies();
		
		for(Cookie allCookies1: c1) {
			System.out.println(allCookies1);
		}
		System.out.println(c1.size());
		
		
	}

}
