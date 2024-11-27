package pom_DDF_TestNG_TestBase_Utility_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class O02_OrangeHRM_HomePage {

	@FindBy(xpath = "//div/ul/li/span[@class='oxd-userdropdown-tab']")
	public WebElement option;
	
	@FindBy(xpath = "//span/h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement logo;
	
	public O02_OrangeHRM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//
	public void click_OrangeHRM_Option_Section() {
		option.click();
	}
	
	//
	public String verify_OrangeHRM_Logo() {
		String actual=logo.getText();
		return actual;
	}
	
}
