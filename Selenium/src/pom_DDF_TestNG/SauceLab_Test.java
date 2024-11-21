package pom_DDF_TestNG;

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

public class SauceLab_Test {

	WebDriver driver;
	Sheet sh;

	SauceLabLoginPage login;
	SauceLab_Menu_Page menu;
	SauceLab_Home_Page home;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\Pranav.xlsx");

		sh=WorkbookFactory.create(file).getSheet("DDF");

		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void login() {

		login=new SauceLabLoginPage(driver);

		String username=sh.getRow(0).getCell(0).getStringCellValue();
		login.enter_SauceLab_UserName(username);

		String password=sh.getRow(0).getCell(1).getStringCellValue();
		login.enter_SauceLab_Password(password);

		login.click_SauceLab_LoginButton();

	}

	@Test
	public void verifyLogo() throws InterruptedException {

		home=new SauceLab_Home_Page(driver);
		home.click_sauceLab_HomePage_MenuButton();
		Thread.sleep(2000);

		String expected=sh.getRow(0).getCell(2).getStringCellValue();
		home.verify_Login_HomePage(expected);

	}

	@AfterMethod
	public void logout() throws InterruptedException {

		menu=new SauceLab_Menu_Page(driver);
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
