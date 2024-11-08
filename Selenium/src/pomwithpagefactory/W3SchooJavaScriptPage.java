package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3SchooJavaScriptPage {
	
	@FindBy(xpath="//a[text()='Try it Yourself »']")private WebElement tryItYourself;
	
	public W3SchooJavaScriptPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click_W3SchooJavaScriptPage_tryItBtn() {
		tryItYourself.click();
	}
	
	

}
