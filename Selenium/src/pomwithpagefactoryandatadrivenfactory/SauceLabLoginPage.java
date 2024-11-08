package pomwithpagefactoryandatadrivenfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabLoginPage {
	
	@FindBy(id="user-name") private WebElement un;
	@FindBy(id="password") private WebElement pass;
	@FindBy(id="login-button") private WebElement button;
	
	public SauceLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enter_SauceLab_UserName(String username) {  //username field method to enter a username
		un.sendKeys(username);
	}
	
	public void enter_SauceLab_Password(String password) {	 //password field method to enter a password
		pass.sendKeys(password);
	}
	
	public void click_SauceLab_LoginButton() { //login button method to click button
		button.click();
	}

}
