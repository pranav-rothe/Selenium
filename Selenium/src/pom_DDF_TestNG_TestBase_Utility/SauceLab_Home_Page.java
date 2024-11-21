package pom_DDF_TestNG_TestBase_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLab_Home_Page {
	
	@FindBy(id="react-burger-menu-btn") private WebElement menuButton;
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	
	public SauceLab_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click_sauceLab_HomePage_MenuButton() { //HomePage Menu Button
		menuButton.click();
	}
	
	public void verify_Login_HomePage(String expected) {
		String actual=logo.getText();
		
		if(actual.equals(expected)) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Failure");
		}
	}

}
