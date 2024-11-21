package testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

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

