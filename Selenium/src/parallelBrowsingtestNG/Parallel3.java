package parallelBrowsingtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
	
	@Test
	public void openAmazonApp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

}
