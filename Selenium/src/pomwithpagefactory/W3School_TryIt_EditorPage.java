package pomwithpagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_TryIt_EditorPage {
	@FindBy(id="iframeResult") private WebElement frame;
	@FindBy(xpath="//button[contains(text(),'Date and Time')]")private WebElement click_Me_Button;
	
	public W3School_TryIt_EditorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void switch_W3School_IFrame(WebDriver driver) {
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(set);
		for(String x: al) {
			System.out.print(x+" ");
		}
		String secondTab=al.get(1);
		driver.switchTo().window(secondTab);
		driver.switchTo().frame(frame);
	}
	
	public void click_W3School_Button(WebDriver driver) {
		switch_W3School_IFrame(driver);
		click_Me_Button.click();
		
	}

}
