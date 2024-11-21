package testNG;

import org.testng.annotations.Test;

public class PriorityWithDependsOnMethod_Parameter {
	
	@Test()
	public void openApp() {
		System.out.println("open app");
	}
	
	@Test(dependsOnMethods = {"openApp"})
	public void userName() {
		System.out.println("username");
	}
	
	@Test()
	public void password() {
		System.out.println("password");
	}
	
	@Test()
	public void loginBtn() {
		System.out.println("login button click");
	}
	
	@Test()
	public void closeApp() {
		System.out.println("close app");
	}
}
