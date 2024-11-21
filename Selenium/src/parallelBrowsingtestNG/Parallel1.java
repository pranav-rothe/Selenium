package parallelBrowsingtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
	public void openFacebookApp() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
