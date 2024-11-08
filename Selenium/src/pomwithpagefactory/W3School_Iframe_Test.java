package pomwithpagefactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School_Iframe_Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
//		driver.manage().window().maximize();
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


		W3SchooJavaScriptPage w=new W3SchooJavaScriptPage(driver);
		w.click_W3SchooJavaScriptPage_tryItBtn();
		
		W3School_Try_It_Page t=new W3School_Try_It_Page(driver);
//		Thread.sleep(2000);
		t.click_W3School_Try_It_Page_btn(driver);
		

//		Thread.sleep(2000);
//		driver.quit();
	}

}
