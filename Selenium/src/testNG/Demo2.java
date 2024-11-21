package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void TC04_OpenBrowser() {
		System.out.println("open browser2");

	}

	@Test
	public void TC05_LoginUserName() {
		Reporter.log("Username2", true);
	}

	@Test
	public void TC06_LoginPassword() {
		Reporter.log("Password2", true);
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}

