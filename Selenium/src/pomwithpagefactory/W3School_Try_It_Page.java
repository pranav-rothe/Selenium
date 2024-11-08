package pomwithpagefactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W3School_Try_It_Page {

	@FindBy(id="iframeResult") private WebElement frame;
	@FindBy(xpath="//button[contains(text(),'Date and Time.')]") private WebElement btn;

	public W3School_Try_It_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	public void switch_W3School_Try_It_Page_Frame(WebDriver driver) {
//		driver.switchTo().frame(frame);		
//	}

	public void click_W3School_Try_It_Page_btn(WebDriver driver) {
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(s);
		for(String x:al) {
			System.out.println(x+"  ");
		}
		String secondTab=al.get(1);
		System.out.println(secondTab);
		driver.switchTo().window(secondTab);
		driver.switchTo().frame(frame);
		btn.click();
	}

}


