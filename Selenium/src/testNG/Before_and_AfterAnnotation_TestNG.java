package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_and_AfterAnnotation_TestNG {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser Open");
	}
	
	@Test
	public void login() {
		System.out.println("Login");
	}
	
	@Test
	public void search() {
		System.out.println("search");
	}
	
	@Test
	public void selectItem() {
		System.out.println("Item Selected");
	}
	
	@Test
	public void logoutBrowser() {
		System.out.println("Browser Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser Close");
	}

}
