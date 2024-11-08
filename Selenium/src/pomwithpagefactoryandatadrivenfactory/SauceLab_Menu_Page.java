package pomwithpagefactoryandatadrivenfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLab_Menu_Page {
	@FindBy(id="about_sidebar_link") private WebElement about;
	@FindBy(id="logout_sidebar_link") private WebElement logout;
	
	public SauceLab_Menu_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click_sauceLab_MenuPage_AboutButton() { //In Menu Button About option button
		about.click();
	}
	
	public void click_sauceLab_MenuPageLogoutButton() { //In Menu Button Logout option button
		logout.click();
	}

}
