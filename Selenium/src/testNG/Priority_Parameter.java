package testNG;

import org.testng.annotations.Test;

public class Priority_Parameter {
	
	@Test(priority = 1)
	public void openApp() {
		System.out.println("open app");
	}
	
	@Test(priority = 2)
	public void userName() {
		System.out.println("username");
	}
	
	@Test(priority = 3)
	public void password() {
		System.out.println("password");
	}
	
	@Test(priority = 6)
	public void loginBtn() {
		System.out.println("login button click");
	}
	
	@Test(priority = 5)
	public void closeApp() {
		System.out.println("close app");
	}
	

}
