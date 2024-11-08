package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_JavaScript_Page {
	@FindBy(xpath="//a[@class='w3-btn']") private WebElement try_it_yourself_Button;
	
	public W3School_JavaScript_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void W3School_JS_Button() {
		try_it_yourself_Button.click();
	}

}
