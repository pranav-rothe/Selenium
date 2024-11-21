package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods_Parameter {
	
	@Test()
	public void openApp() {
		System.out.println("openApp");
	}
	
	@Test(dependsOnMethods = {"openApp"})
	public void userName() {
		System.out.println("username");
	}
	
	@Test(dependsOnMethods = {"userName"})
	public void password() {
		System.out.println("password");
	}
	
	@Test(dependsOnMethods = {"userName","password"})
	public void button() {
		System.out.println("login");
	}
	
}
