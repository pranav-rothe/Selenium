package testNG;

import org.testng.annotations.Test;

public class PriorityWithDependsOnMethod_Parameter2 {
	
	@Test()
	public void openApp() {
		System.out.println("open app");
	}
	
	@Test(priority = 1,dependsOnMethods = {"openApp"})
	public void userName() {
		System.out.println("username");
	}
	
	@Test()
	public void password() {
		System.out.println("password");
	}
	
	@Test(priority = 5)
	public void loginBtn() {
		System.out.println("login button click");
	}
	
	@Test()
	public void closeApp() {
		System.out.println("close app");
	}
}
