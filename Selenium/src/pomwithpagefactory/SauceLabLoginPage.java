package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabLoginPage {
	
	@FindBy(id="user-name") private WebElement sauceLab_UN;
	@FindBy(id="password") private WebElement sauceLab_Pass;
	@FindBy(id="login-button") private WebElement sauceLab_Btn;
	
	public SauceLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enter_SauceLab_UserName() {  //username field method to enter a username
		sauceLab_UN.sendKeys("standard_user");
	}
	
	public void enter_SauceLab_Password() {	 //password field method to enter a password
		sauceLab_Pass.sendKeys("secret_sauce");
	}
	
	public void click_SauceLab_LoginButton() { //login button method to click button
		sauceLab_Btn.click();
	}

}
