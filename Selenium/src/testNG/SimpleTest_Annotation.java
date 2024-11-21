package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleTest_Annotation {
	
	@Test
	public void TC01_OpenBrowser() {
		System.out.println("open browser");
		
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
