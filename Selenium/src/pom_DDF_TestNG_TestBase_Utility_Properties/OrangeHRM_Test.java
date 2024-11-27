package pom_DDF_TestNG_TestBase_Utility_Properties;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM_Test extends OrangeHRM_TestBase {

	O01_OrangeHRM_LoginPage login;
	O02_OrangeHRM_HomePage home;
	O03_OrangeHRM_OptionMenu option;
	int TCID;

	@BeforeClass
	public void openBrowser() throws IOException {
		openApp();
		login=new O01_OrangeHRM_LoginPage(driver);
		home=new O02_OrangeHRM_HomePage(driver);
		option=new O03_OrangeHRM_OptionMenu(driver);
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		String username=OrangeHRM_Utility.getPFData("USERNAME");//entering a username here
		Thread.sleep(2000);
		login.enter_OrangeHRM_Username(username);

		String password=OrangeHRM_Utility.getPFData("PASSWORD");//entering a password here
		Thread.sleep(2000);
		login.enter_OrangeHRM_Password(password);

		Thread.sleep(2000);
		login.enter_OrangeHRM_LoginBTN();//clicking on login button
	}

	@Test
	public void verifyLogo() throws EncryptedDocumentException, IOException, InterruptedException {
		String expected=OrangeHRM_Utility.getExcelData(0, 2);
		String actual=home.verify_OrangeHRM_Logo();
		Assert.assertEquals(actual, expected, "Logo or text is not match");	

		home.click_OrangeHRM_Option_Section();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		option.click_OrangeHRM_Support_Option();	
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		home.click_OrangeHRM_Option_Section();
		
		Thread.sleep(2000);
		option.click_OrangeHRM_Logout_Option();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();		
	}
}
