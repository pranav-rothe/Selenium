package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab_Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		SauceLabLoginPage login=new SauceLabLoginPage(driver);
		login.enter_SauceLab_UserName();
		login.enter_SauceLab_Password();
		login.click_SauceLab_LoginButton();
		
		SauceLabMenuButton menu=new SauceLabMenuButton(driver);
		menu.sauceLab_MenuButton();
		Thread.sleep(2000);
		
		menu.sauceLab_AboutButton();
		Thread.sleep(2000);
		
		driver.navigate().back();
		menu.sauceLab_MenuButton();
		Thread.sleep(2000);
		
		menu.sauceLab_LogoutButton();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
