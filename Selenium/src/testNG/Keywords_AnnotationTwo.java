package testNG;

import org.testng.annotations.Test;

public class Keywords_AnnotationTwo {
	
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 1, dependsOnMethods = {"login"})
	public void TC01() {
		System.out.println("username");
	}
	
	@Test(alwaysRun = true)
	public void TC02() {
		System.out.println("password");
	}
	
	@Test
	public void TC03() {
		System.out.println("button");
	}
	
	

}
