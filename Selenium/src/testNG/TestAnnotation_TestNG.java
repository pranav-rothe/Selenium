package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotation_TestNG {
	
	@Test
	public void TC01_OpenBrowser() {
		//System.out.println("open browser");
		Reporter.log("open browser", true);
	}
	
	@Test
	public void TC02_LoginUserName() {
		Reporter.log("Username", true);
	}
	
	@Test
	public void TC03_LoginPassword() {
		Reporter.log("Password", true);
	}
}
