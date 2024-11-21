package parallelBrowsingtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	
	@Test
	public void openGoogleApp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
