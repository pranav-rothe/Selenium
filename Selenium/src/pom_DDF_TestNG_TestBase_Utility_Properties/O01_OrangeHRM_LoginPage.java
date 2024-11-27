package pom_DDF_TestNG_TestBase_Utility_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class O01_OrangeHRM_LoginPage {
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement un;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement pass;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginbtn;
	
	public O01_OrangeHRM_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//username field method
	public void enter_OrangeHRM_Username(String username) {
		un.sendKeys(username);
	}
	
	//password field method
	public void enter_OrangeHRM_Password(String password) {
		pass.sendKeys(password);
	}
	
	//login button method
	public void enter_OrangeHRM_LoginBTN() {
		loginbtn.click();
	}

}
