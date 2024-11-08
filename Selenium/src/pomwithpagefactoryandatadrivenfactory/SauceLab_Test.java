package pomwithpagefactoryandatadrivenfactory;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab_Test {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\Pranav.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		SauceLabLoginPage login=new SauceLabLoginPage(driver);
		
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		login.enter_SauceLab_UserName(username);
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		login.enter_SauceLab_Password(password);
		
		login.click_SauceLab_LoginButton();
		
		SauceLab_Home_Page home=new SauceLab_Home_Page(driver);
		home.click_sauceLab_HomePage_MenuButton();
		Thread.sleep(2000);
		
		String expected=sh.getRow(0).getCell(2).getStringCellValue();
		home.verify_Login_HomePage(expected);
		
		SauceLab_Menu_Page menu=new SauceLab_Menu_Page(driver);
		menu.click_sauceLab_MenuPage_AboutButton();
		Thread.sleep(2000);
		
		driver.navigate().back();
		home.click_sauceLab_HomePage_MenuButton();
		Thread.sleep(2000);
		
		menu.click_sauceLab_MenuPageLogoutButton();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
