package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School_Test_Iframe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/");
		driver.manage().window().maximize();
		
		W3School_JavaScript_Page button=new W3School_JavaScript_Page(driver);
		button.W3School_JS_Button();
		
		W3School_TryIt_EditorPage tryit=new W3School_TryIt_EditorPage(driver);
		tryit.switch_W3School_IFrame(driver);
		tryit.click_W3School_Button(driver);
	}

}
