package pom_DDF_TestNG_TestBase_Utility_Properties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_TestBase {
	
	WebDriver driver;
	
	//open the OrangeHRM browser
	public void openApp() throws IOException {
		driver=new ChromeDriver();
		driver.get(OrangeHRM_Utility.getPFData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
