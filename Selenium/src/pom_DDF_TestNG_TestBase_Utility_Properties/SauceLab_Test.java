package pom_DDF_TestNG_TestBase_Utility_Properties;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLab_Test extends TestBase{

	SauceLabLoginPage login;
	SauceLab_Menu_Page menu;
	SauceLab_Home_Page home;

	int TCID;

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

		String username=Utility.getPFData("UN");
		login.enter_SauceLab_UserName(username);

		String password=Utility.getPFData("PASS");
		login.enter_SauceLab_Password(password);

		login.click_SauceLab_LoginButton();
	}

	@Test
	public void verifyLogo() throws InterruptedException, EncryptedDocumentException, IOException {

		TCID=03;		

		String expected=Utility.getExcelData(0, 2);

		String actual=home.verify_Login_HomePage();
		Assert.assertEquals(actual, expected, "Logo not match");

		home.click_sauceLab_HomePage_MenuButton();

	}

	@AfterMethod
	public void logout(ITestResult s) throws InterruptedException, IOException {

		if(s.getStatus()==ITestResult.FAILURE) {
			Utility.getScreenShot(driver, TCID);
		}

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
