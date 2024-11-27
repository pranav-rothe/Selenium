package pom_DDF_TestNG_TestBase_Utility_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class O03_OrangeHRM_OptionMenu {

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a[text()='Support']")
	public WebElement support;

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")
	public WebElement logout;

	public O03_OrangeHRM_OptionMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//click on support option
	public void click_OrangeHRM_Support_Option() {
		support.click();
	}

	//click on logout option
	public void click_OrangeHRM_Logout_Option() {
		logout.click();
	}	

}
