package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabMenuButton {
	
	@FindBy(id="react-burger-menu-btn") private WebElement sauceLab_HomePage_MenuButton;
	@FindBy(id="about_sidebar_link") private WebElement sauceLab_Menu_About;
	@FindBy(id="logout_sidebar_link") private WebElement sauceLab_Menu_Logout;
	
	public SauceLabMenuButton(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sauceLab_MenuButton() { //HomePage Menu Button
		sauceLab_HomePage_MenuButton.click();
	}
	
	public void sauceLab_AboutButton() { //In Menu Button About option button
		sauceLab_Menu_About.click();
	}
	
	public void sauceLab_LogoutButton() { //In Menu Button Logout option button
		sauceLab_Menu_Logout.click();
	}

}
