package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfter_Method_Annotations {
	
	/*
	 This is a before method and after method annotation use in TestNG framework. 
	 In this annotation first TestNG called a before method then all test cases method or
	 test method then TestNG called after method.
	 */
	
	@BeforeMethod
	public void login() {
		System.out.println("login"); //1st scenario-- 1st execute this method 
	}								 //2nd scenario-- 1st execute this method 
	
	@Test(invocationCount = 2)
	public void TC01() {
		System.out.println("userone"); //1st scenario-- then TC01 testCase methods
	}								   //2nd scenario-- skip because we use before and after method
	
	@Test
	public void TC02() {
		System.out.println("usertwo"); //1st scenario-- skip because we use before and after method
	}								   //2nd scenario-- then execute this method
	
	@AfterMethod
	public void logout() {
		System.out.println("logout"); //1st scenario-- then executes this after method
	}								  //2nd scenario-- then execute this method
	
	

}
