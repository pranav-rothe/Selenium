package pom_DDF_TestNG_TestBase_Utility_Properties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;
	
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.get(Utility.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
	}

}
