package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Version_BrowserName {

	public static void main(String[] args) {

		//ChromeDriver driver=new ChromeDriver();		
		EdgeDriver driver=new EdgeDriver();
		System.out.println(driver.getCapabilities().getBrowserName()); //browser name
		System.out.println(driver.getCapabilities().getBrowserVersion()); //version
	}

}
