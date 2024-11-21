package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void TC07_OpenBrowser() {
		System.out.println("open browser3");

	}

	@Test
	public void TC08_LoginUserName() {
		Reporter.log("Username3", true);
	}

	@Test
	public void TC09_LoginPassword() {
		Reporter.log("Password3", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
}

