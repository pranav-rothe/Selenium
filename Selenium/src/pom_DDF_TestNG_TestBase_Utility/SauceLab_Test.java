package pom_DDF_TestNG_TestBase_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLab_Test extends TestBase{

	SauceLabLoginPage login;
	SauceLab_Menu_Page menu;
	SauceLab_Home_Page home;

	@BeforeClass
	public void openBrowwser() throws EncryptedDocumentException, IOException
	{
		openBrowser();
		login=new SauceLabLoginPage(driver);
		home=new SauceLab_Home_Page(driver);
		menu=new SauceLab_Menu_Page(driver);
	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {		

		String username=Utility.getExcelData(0, 0);
		login.enter_SauceLab_UserName(username);

		String password=Utility.getExcelData(0, 1);
		login.enter_SauceLab_Password(password);

		login.click_SauceLab_LoginButton();
	}

	@Test
	public void verifyLogo() throws InterruptedException, EncryptedDocumentException, IOException {

		home.click_sauceLab_HomePage_MenuButton();
		Thread.sleep(2000);

		String expected=Utility.getExcelData(0, 2);
		home.verify_Login_HomePage(expected);

	}

	@AfterMethod
	public void logout() throws InterruptedException {

		menu.click_sauceLab_MenuPage_AboutButton();
		Thread.sleep(2000);

		driver.navigate().back();
		home.click_sauceLab_HomePage_MenuButton();
		Thread.sleep(2000);

		menu.click_sauceLab_MenuPageLogoutButton();

	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}
